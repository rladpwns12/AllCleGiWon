package allclegiwon.domain;

import allclegiwon.domain.*;
import allclegiwon.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class StudentCreated extends AbstractEvent {

    private Long id;
    private Long studentId;
    private String name;
    private String email;
    private String password;
    private Department department;

    public StudentCreated(Student aggregate) {
        super(aggregate);
    }

    public StudentCreated() {
        super();
    }
    // keep

}
