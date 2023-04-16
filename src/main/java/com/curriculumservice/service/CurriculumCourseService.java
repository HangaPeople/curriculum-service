package com.curriculumservice.service;

import com.curriculumservice.entity.Course;
import com.curriculumservice.entity.CurriculumCourse;
import com.curriculumservice.exception.ResourceNotFoundException;
import com.curriculumservice.repository.CurriculumCourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CurriculumCourseService {

    private final CurriculumCourseRepository curriculumCourseRepository;

    public List<Course> findCoursesByCurriculumId(Long curriculumId) {
        return curriculumCourseRepository.findCoursesByCurriculumId(curriculumId);
    }

    public CurriculumCourse createCurriculumCourse(CurriculumCourse curriculumCourse) {
        return curriculumCourseRepository.save(curriculumCourse);
    }

    public void deleteCurriculumCourse(Long id) {
        CurriculumCourse curriculumCourse = curriculumCourseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("CurriculumCourse", "id", id));

        curriculumCourseRepository.delete(curriculumCourse);
    }
}
