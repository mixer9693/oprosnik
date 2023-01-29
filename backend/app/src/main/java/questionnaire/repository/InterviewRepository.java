package questionnaire.repository;

import org.springframework.data.repository.CrudRepository;
import questionnaire.model.entity.Interview;

public interface InterviewRepository extends CrudRepository<Interview, Integer> {
}
