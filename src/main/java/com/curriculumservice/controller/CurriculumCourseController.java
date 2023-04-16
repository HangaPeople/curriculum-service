package com.curriculumservice.controller;

import com.curriculumservice.entity.Course;
import com.curriculumservice.entity.CurriculumCourse;
import com.curriculumservice.service.CurriculumCourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/curriculum-courses")
public class CurriculumCourseController {

    private final CurriculumCourseService curriculumCourseService;

    @GetMapping("/{id}")
    public ResponseEntity<List<Course>> getCurriculumCourseById(@PathVariable Long id) {
        List<Course> curriculumCourse = curriculumCourseService.findCoursesByCurriculumId(id);
        return ResponseEntity.ok(curriculumCourse);
    }

    @PostMapping
    public ResponseEntity<CurriculumCourse> createCurriculumCourse(@RequestBody CurriculumCourse curriculumCourse) {
        CurriculumCourse savedCurriculumCourse = curriculumCourseService.createCurriculumCourse(curriculumCourse);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCurriculumCourse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCurriculumCourse(@PathVariable Long id) {
        curriculumCourseService.deleteCurriculumCourse(id);
        return ResponseEntity.noContent().build();
    }
}

