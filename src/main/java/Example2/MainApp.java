package Example2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class MainApp {

    public static void main(String[] args) {

        ConfigurableApplicationContext container = SpringApplication.run(MainApp.class);
        DatabaseConfiguration db = (DatabaseConfiguration) container.getBean("databaseConfiguration");

        System.out.println(db.getPort());
        System.out.println(db.getUrl());
        System.out.println(db.getUsername());
        System.out.println(db.getPassword());
        System.out.println(db.getDbProfile());


        // Email Data

       EmailCredentialConfiguration email=(EmailCredentialConfiguration) container.getBean("emailCredentialConfiguration");

        System.out.println(email.getEmailHost());
        System.out.println(email.getEmailID());
        System.out.println(email.getEmailPassword());
    }
}
