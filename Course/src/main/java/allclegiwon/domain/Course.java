package allclegiwon.domain;

import allclegiwon.CourseApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Course_table")
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long courseId;

    private Long studentId;

    private Department department;

    private String title;

    private String porfessorName;

    private Integer credit;

    private Integer numberOfStudents;

    private Integer spare;

    private Integer capacity;

    private Integer year;

    private Semester semester;

    public static CourseRepository repository() {
        CourseRepository courseRepository = CourseApplication.applicationContext.getBean(
            CourseRepository.class
        );
        return courseRepository;
    }
}
