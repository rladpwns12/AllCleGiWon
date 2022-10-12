package allclegiwon.domain;

import allclegiwon.domain.*;
import allclegiwon.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class StudentDeleted extends AbstractEvent {

    private Long id;
    private Long studentId;
    private String name;
    private String email;
    private String password;
    private Department department;

    public StudentDeleted(Student aggregate) {
        super(aggregate);
    }

    public StudentDeleted() {
        super();
    }
    // keep

}
