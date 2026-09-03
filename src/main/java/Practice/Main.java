package Practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        ConfigurableApplicationContext con= SpringApplication.run(Main.class);
       DatabaseCon d=(DatabaseCon) con.getBean("databaseCon");
        System.out.println(d);

    }
}
