package com.curriculumservice.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class CurriculumCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "curriculum_id")
    private Curriculum curriculum;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

}
