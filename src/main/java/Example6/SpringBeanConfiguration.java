package Example6;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfiguration {


    @Bean(initMethod = "email2LifeCycle", destroyMethod = "email2LifeCycleDestroy")
    public EmailConfiguration emailConnection() {

        return new EmailConfiguration();
    }


}
