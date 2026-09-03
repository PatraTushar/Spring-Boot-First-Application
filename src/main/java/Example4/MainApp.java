package Example4;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApp {

    public static void main(String[] args) {

       ConfigurableApplicationContext container= SpringApplication.run(MainApp.class);

        System.out.println(" In utilization state ");

      DatabaseConnection connection1=(DatabaseConnection) container.getBean("databaseConnection");
        System.out.println(" utilizing bean "+connection1);

      DatabaseConnection connection2=(DatabaseConnection) container.getBean("databaseConnection");
        System.out.println(" utilizing bean "+connection2);




    }
}
