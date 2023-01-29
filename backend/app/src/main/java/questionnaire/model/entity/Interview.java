package questionnaire.model.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "interviews")
@Data
public class Interview {
    @Id
    @GeneratedValue(generator = "interviews_id_gen")
    @SequenceGenerator(name = "interviews_id_gen", sequenceName = "interviews_id_sqn",
            allocationSize = 1,
            initialValue = 1000)
    private Integer id;
    private String name;
}
