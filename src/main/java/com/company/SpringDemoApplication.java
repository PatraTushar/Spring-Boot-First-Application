package com.company;


import com.company.controller.StudentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {


        ApplicationContext context =
                SpringApplication.run(SpringDemoApplication.class, args);

        StudentController controller =
                context.getBean(StudentController.class);

        controller.start();
    }
}
