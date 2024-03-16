package com.example.carlsonapp.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "university_groups")
@Getter
@Setter
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "group_number")
    private String groupNumber;

    @OneToMany(mappedBy = "universityGroup")
    private List<Student> students;

    public Group() {}
    public Group(String groupNumber, List<Student> students) {
        this.groupNumber = groupNumber;
        this.students = students;
    }
    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", groupNumber='" + groupNumber + '\'' +
                '}';
    }
}
