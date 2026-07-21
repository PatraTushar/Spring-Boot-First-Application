package Example6;

import Example5.EmailConnection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApp {

    public static void main(String[] args) {


        ConfigurableApplicationContext container= SpringApplication.run(MainApp.class);

        // Email : Annotations

        EmailConfiguration a1=(EmailConfiguration) container.getBean("emailConnection");
        EmailConfiguration a2=(EmailConfiguration) container.getBean("emailConnection");

    }
}
