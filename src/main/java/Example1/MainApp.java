package Example1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApp {

    public static void main(String[] args) {

        ConfigurableApplicationContext container = SpringApplication.run(MainApp.class);

        Garage garage=(Garage) container.getBean("garage");

       Vehicle v= garage.getVehicle();

        System.out.println(v.getClass());
        System.out.println(v.vehicleType());




    }
}
