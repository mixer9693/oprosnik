package questionnaire.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import questionnaire.model.dto.InterviewInputDto;
import questionnaire.model.dto.InterviewOutputDto;
import questionnaire.model.entity.Interview;
import questionnaire.model.mapper.InterviewMapper;
import questionnaire.repository.InterviewRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class InterviewServiceImpl implements InterviewService {
    private final InterviewRepository repository;
    private final InterviewMapper mapper;

    @Override
    public InterviewOutputDto create(InterviewInputDto inputDto) {
        Interview interview = mapper.dtoToInterview(inputDto);
        repository.save(interview);

        return mapper.interviewToDto(interview);
    }

    @Override
    public InterviewOutputDto getById(Integer id) {
        Interview interview = repository.findById(id).orElseThrow();

        return mapper.interviewToDto(interview);
    }

    @Override
    public List<InterviewOutputDto> getAll() {
        List<InterviewOutputDto> outputDtoList = new ArrayList<>();
        repository.findAll().forEach(e -> outputDtoList.add(mapper.interviewToDto(e)));

        return outputDtoList;
    }
}
