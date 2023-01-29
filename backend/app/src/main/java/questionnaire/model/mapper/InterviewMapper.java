package questionnaire.model.mapper;

import org.springframework.stereotype.Component;
import questionnaire.model.dto.InterviewInputDto;
import questionnaire.model.dto.InterviewOutputDto;
import questionnaire.model.entity.Interview;

@Component
public class InterviewMapper {

    public Interview dtoToInterview(InterviewInputDto dto){
        Interview interview = new Interview();
        interview.setName(dto.getName());

        return interview;
    }

    public InterviewOutputDto interviewToDto(Interview interview){
        InterviewOutputDto dto = new InterviewOutputDto();
        dto.setId(interview.getId());
        dto.setName(interview.getName());

        return dto;
    }

}
