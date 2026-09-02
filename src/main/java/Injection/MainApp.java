package Injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApp {

    public static void main(String[] args) {

        ConfigurableApplicationContext container= SpringApplication.run(MainApp.class);
       Car c= container.getBean(Car.class);
       c.drive();
    }
}
