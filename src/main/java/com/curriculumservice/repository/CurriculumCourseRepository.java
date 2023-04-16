package com.curriculumservice.repository;

import com.curriculumservice.entity.Course;
import com.curriculumservice.entity.CurriculumCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CurriculumCourseRepository extends JpaRepository<CurriculumCourse, Long> {

    @Query("SELECT cc.course FROM CurriculumCourse cc WHERE cc.curriculum.id = :curriculumId")
    List<Course> findCoursesByCurriculumId(Long curriculumId);
}
