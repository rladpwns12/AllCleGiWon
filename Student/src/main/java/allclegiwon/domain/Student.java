package allclegiwon.domain;

import allclegiwon.StudentApplication;
import allclegiwon.domain.StudentCreated;
import allclegiwon.domain.StudentDeleted;
import allclegiwon.domain.StudentLoggedIn;
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

    private Department department;

    @PostPersist
    public void onPostPersist() {
        StudentCreated studentCreated = new StudentCreated(this);
        studentCreated.publishAfterCommit();

        StudentLoggedIn studentLoggedIn = new StudentLoggedIn(this);
        studentLoggedIn.publishAfterCommit();
    }

    @PostRemove
    public void onPostRemove() {
        StudentDeleted studentDeleted = new StudentDeleted(this);
        studentDeleted.publishAfterCommit();
    }

    @PreRemove
    public void onPreRemove() {}

    public static StudentRepository repository() {
        StudentRepository studentRepository = StudentApplication.applicationContext.getBean(
            StudentRepository.class
        );
        return studentRepository;
    }
}
