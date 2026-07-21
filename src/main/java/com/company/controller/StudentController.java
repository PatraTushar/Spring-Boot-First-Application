package com.company.controller;

import com.company.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentController {

    @Autowired
    StudentService service;

    public StudentController() {

        System.out.println("StudentController Created");

    }

    public void start() {

        service.registerStudent();

    }
}
