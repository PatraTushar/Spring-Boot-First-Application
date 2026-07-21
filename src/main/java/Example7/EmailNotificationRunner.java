package Example7;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Order(1)
@Component
public class EmailNotificationRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        for (String arg:args){

            System.out.println(arg);
        }

        System.out.println(" This is a CommandLineRunner..........");
        System.out.println(" Your Application is ready to start the application ");
        System.out.println(" Sending email to the developer team ");
    }

    public void email() {

        System.out.println(" This is a normal method ");
    }
}
