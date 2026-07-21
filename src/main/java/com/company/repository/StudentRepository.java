package com.company.repository;

import org.springframework.stereotype.Component;

@Component
public class StudentRepository {

    public StudentRepository() {
        System.out.println("StudentRepository Created");
    }

    public void save() {

        System.out.println("Saving Student into Database");

    }

}
