package SpringBeanScopes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class MainApp {

    public static void main(String[] args) {

        ConfigurableApplicationContext container= SpringApplication.run(MainApp.class);

       Product p1=(Product) container.getBean("product");
        System.out.println(p1);

        Product p2=(Product) container.getBean("product");
        System.out.println(p2);

        Product p3=(Product) container.getBean("product");
        System.out.println(p3);



        Order o1=(Order) container.getBean("order");
        System.out.println(o1.getProduct());

        Order o2=(Order) container.getBean("order");
        System.out.println(o2.getProduct());


        // singleton

        Product p4=(Product) container.getBean("product");
        System.out.println(p4);

        Product p5=(Product) container.getBean("product");
        System.out.println(p5);


        // prototype


        Product p6=(Product) container.getBean("product2");
        System.out.println(p6);


        Product p7=(Product) container.getBean("product2");
        System.out.println(p7);




    }
}
