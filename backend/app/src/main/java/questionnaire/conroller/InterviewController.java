package questionnaire.conroller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import questionnaire.model.dto.InterviewInputDto;
import questionnaire.model.dto.InterviewOutputDto;
import questionnaire.service.InterviewService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class InterviewController {
    private final InterviewService interviewService;

    @PostMapping("/interviews")
    public InterviewOutputDto create(@RequestBody InterviewInputDto dto){
        return interviewService.create(dto);
    }

    @GetMapping("/interviews/{id}")
    public InterviewOutputDto getById(@PathVariable Integer id){
        return interviewService.getById(id);
    }

    @GetMapping("/interviews")
    public List<InterviewOutputDto> getAll(){
        return interviewService.getAll();
    }

}
