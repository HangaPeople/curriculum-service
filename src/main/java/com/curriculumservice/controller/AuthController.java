package com.curriculumservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth/user")
public class AuthController {

    @GetMapping("/signup")
    public String signup() {
        return "auth 회원가입";
    }

    @GetMapping("/login")
    public String login() {
        return "auth 로그인";
    }
}
