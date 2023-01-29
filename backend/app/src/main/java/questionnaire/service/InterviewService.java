package questionnaire.service;

import questionnaire.model.dto.InterviewInputDto;
import questionnaire.model.dto.InterviewOutputDto;

import java.util.List;

public interface InterviewService {
    InterviewOutputDto create(InterviewInputDto inputDto);
    InterviewOutputDto getById(Integer id);
    List<InterviewOutputDto> getAll();
}
