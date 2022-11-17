package com.smash.courseapi.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long course_id;

    private String courseName;
    private String description;
    private int creditHour;

    public Course() {
    }

    public Course(String courseName, String description, int creditHour) {
        this.courseName = courseName;
        this.description = description;
        this.creditHour = creditHour;
    }
}
