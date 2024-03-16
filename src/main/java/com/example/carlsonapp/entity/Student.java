package com.example.carlsonapp.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "students")
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "surmane")
    private String surmane;

    @ManyToOne
    @JoinColumn(name = "university_group")
    private Group universityGroup;

    public Student() {}
    public Student(String surmane, Group universityGroup) {
        this.surmane = surmane;
        this.universityGroup = universityGroup;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surmane='" + surmane + '\'' +
                ", universityGroup=" + universityGroup +
                '}';
    }
}
