package com.company.service;

import com.company.model.Student;
import com.company.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentService {


    @Autowired
    StudentRepository repository;

    @Autowired
    Student student;

    public StudentService() {

        System.out.println("StudentService Created");

    }

    public void registerStudent() {

        System.out.println(student.getName());

        repository.save();

    }

}
