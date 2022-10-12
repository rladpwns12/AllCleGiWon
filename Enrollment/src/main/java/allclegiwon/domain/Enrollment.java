package allclegiwon.domain;

import allclegiwon.EnrollmentApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Enrollment_table")
@Data
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long studentId;

    private Long courseId;

    public static EnrollmentRepository repository() {
        EnrollmentRepository enrollmentRepository = EnrollmentApplication.applicationContext.getBean(
            EnrollmentRepository.class
        );
        return enrollmentRepository;
    }
}
