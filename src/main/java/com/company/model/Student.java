package com.company.model;

public class Student {


    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;

        System.out.println("Student Object Created");
    }

    public String getName() {
        return name;
    }

}
