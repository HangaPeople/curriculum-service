package com.curriculumservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/curr")
public class CurrController {

    @GetMapping
    public String hello() {
        return "안녕 난 커리큘럼 서비스야!";
    }
}
