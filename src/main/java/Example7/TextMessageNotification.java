package Example7;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Order(2)
@Component
public class TextMessageNotification implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println(" Sending text message to Management ");

        String[] values=args.getSourceArgs();

        for (String val:values){
            System.out.println(val);
        }



        System.out.println(" Text message sent successfully ");

    }
}
