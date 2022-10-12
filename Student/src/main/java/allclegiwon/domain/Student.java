package allclegiwon.domain;

import allclegiwon.StudentApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Student_table")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;

    private String name;

    private String email;

    private String password;

    public static StudentRepository repository() {
        StudentRepository studentRepository = StudentApplication.applicationContext.getBean(
            StudentRepository.class
        );
        return studentRepository;
    }
}
