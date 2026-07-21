package Example2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmailCredentialConfiguration {


    // @Value("${spring.mail.host}")
    private String emailHost;

    @Value("${spring.mail.username}")
    private String emailID;

    //  @Value("${spring.mail.password}")
    private String emailPassword;


    public EmailCredentialConfiguration(@Value("${spring.mail.host}") String emailHost) {

        super();
        this.emailHost = emailHost;

    }

    public String getEmailHost() {
        System.out.println(" zero parameter constructor is called ");
        return emailHost;
    }

    public void setEmailHost(@Value("${spring.mail.host}") String emailHost) {

        System.out.println(" one parameter constructor is called " + emailHost);
        this.emailHost = emailHost;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getEmailPassword() {
        return emailPassword;
    }


    @Value("${spring.mail.password}")
    public void setEmailPassword(String emailPassword) {

        System.out.println(" setEmailPassword is called and injected value " + emailPassword);
        this.emailPassword = emailPassword;
    }
}
