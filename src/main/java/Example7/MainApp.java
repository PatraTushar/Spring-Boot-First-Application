package Example7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class MainApp {

    public static void main(String[] args) {


        System.out.println(" Args size "+args.length);

        for (String arg:args){

            System.out.println(arg);
        }

        System.out.println(" Before run method ");
        ConfigurableApplicationContext container = SpringApplication.run(MainApp.class,args);
        System.out.println(" After run method completed ");

        System.out.println(" ------ Spring Boot Application Started ------- ");

        Product p1 = (Product) container.getBean("product");
        System.out.println(p1);
    }
}
