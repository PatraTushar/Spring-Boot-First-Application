package Example3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("aws")
@PropertySource("classpath:aws-database.properties")
public class AWSDatabaseConfiguration {


    @Value("${aws.db.url}")
    private String awsHost;

    @Value("${aws.db.username}")
    private String awsUsername;

    @Value("${aws.db.password}")
    private String awsPassword;

    public String getAwsHost() {
        return awsHost;
    }

    public void setAwsHost(String awsHost) {
        this.awsHost = awsHost;
    }

    public String getAwsUsername() {
        return awsUsername;
    }

    public void setAwsUsername(String awsUsername) {
        this.awsUsername = awsUsername;
    }

    public String getAwsPassword() {
        return awsPassword;
    }

    public void setAwsPassword(String awsPassword) {
        this.awsPassword = awsPassword;
    }
}
