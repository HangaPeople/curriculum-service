package com.curriculumservice.service;

import com.curriculumservice.entity.Course;
import com.curriculumservice.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;

    public List<Course> getCourseByMajor(String major) {
        return courseRepository.findByMajor(major);
    }

    public List<Course> getCourseByGrade(String grade) {
        return courseRepository.findByGrade(grade);
    }

    public List<Course> getCourseByMajorAndGrade(String major, String grade) {
        return courseRepository.findByMajorAndGrade(major, grade);
    }
}
