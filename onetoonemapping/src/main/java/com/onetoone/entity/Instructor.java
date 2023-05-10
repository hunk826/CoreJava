package com.onetoone.entity;
import java.util.List;

import javax.persistence.*;
import lombok.*;


@Entity
@Table(name = "instructor")
@Getter
@Setter
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Instructor
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy="instructor",
            cascade= {CascadeType.ALL})
    private List<Course> courses;

}
