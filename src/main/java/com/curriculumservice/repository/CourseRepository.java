package com.curriculumservice.repository;

import com.curriculumservice.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    // 전공, 학년, 요일, 시간
    List<Course> findByMajor(String major);
    List<Course> findByGrade(String grade);
    List<Course> findByMajorAndGrade(String major, String grade);
}
