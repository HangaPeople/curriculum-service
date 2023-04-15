package com.curriculumservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String major;
    private String grade;
    private String classify;
    private String course;
    private String courseCode;
    private String credit;
    private String professor;
    private String startTime;
    private String endTime;
    private String courseType;
    private String note;
    @Column(length = 1000)
    private String description;
    @Column(length = 1000)
    private String goal;
    @Column(length = 1000)
    private String preCourse;
    @Column(length = 1000)
    private String process;
}
