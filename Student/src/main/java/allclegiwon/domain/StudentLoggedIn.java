package allclegiwon.domain;

import allclegiwon.domain.*;
import allclegiwon.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class StudentLoggedIn extends AbstractEvent {

    private Long id;
    private Long studentId;
    private String name;
    private String email;
    private String password;
    private Department department;

    public StudentLoggedIn(Student aggregate) {
        super(aggregate);
    }

    public StudentLoggedIn() {
        super();
    }
    // keep

}
