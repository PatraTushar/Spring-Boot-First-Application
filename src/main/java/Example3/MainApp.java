package Example3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class MainApp {

    public static void main(String[] args) {

        ConfigurableApplicationContext container= SpringApplication.run(MainApp.class);
       OrganizationInfo org=(OrganizationInfo) container.getBean("organizationInfo");
        System.out.println(org.getOrgEmpCount());
        System.out.println(org.getDeptNames());

        org.getDeptNames().forEach(System.out::println);


       AWSDatabaseConfiguration container1=(AWSDatabaseConfiguration) container.getBean("aws");
        System.out.println(container1.getAwsHost());
        System.out.println(container1.getAwsUsername());
        System.out.println(container1.getAwsPassword());


    }
}
