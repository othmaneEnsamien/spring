package entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sno;
    @Column(name = "stdName")
    private String stdName;
    @Column(name = "stdClass")
    private String stdClass;
    @Column(name = "schoolName")
    private String schoolName;
}
