package Example7;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Order(3)
@Component
public class PushNotification implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        System.out.println(" Sending push notification to Developer team ");

        for (String arg:args){

            System.out.println(arg);
        }

        System.out.println(" Push Notification  Sent Successfully  ");
    }
}
