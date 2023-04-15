package com.curriculumservice.dto;

import com.curriculumservice.entity.Curriculum;
import com.curriculumservice.entity.CurriculumCourse;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CurriculumDto {
    private Long id;
    private String title;
    private String description;
    private Long userId;
    private List<CurriculumCourse> courses;

    public static CurriculumDto fromEntity(Curriculum curr) {
        return new CurriculumDto(
                curr.getId(),
                curr.getTitle(),
                curr.getDescription(),
                curr.getUser().getId(),
                curr.getCurriculumCourses()
        );
    }
}
