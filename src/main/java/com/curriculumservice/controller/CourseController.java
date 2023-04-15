package com.curriculumservice.controller;

import com.curriculumservice.entity.Course;
import com.curriculumservice.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @GetMapping("/course/major/{major}")
    private List<Course> getCourseByMajor(@PathVariable String major) {
        return courseService.getCourseByMajor(major);
    }

    @GetMapping("/course/grade/{grade}")
    private List<Course> getCourseByGrade(@PathVariable String grade) {
        return courseService.getCourseByGrade(grade);
    }

    @GetMapping("/course/major/{major}/grade/{grade}")
    private List<Course> getCourseByMajorAndGrade(@PathVariable String major,
                                                  @PathVariable String grade) {
        return courseService.getCourseByMajorAndGrade(major, grade);
    }
}
