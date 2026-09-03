package Practice;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class DatabaseCon {

    @Value("http://google.com")
    private String url;

    private String username;
    @Value("563493fwqbfiqhefb")
    private String password;


    public DatabaseCon() {

        System.out.println(" DatabaseCon object is created ");
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    @Value("MANISH")
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @PostConstruct
    public void beanCreation() {

        System.out.println(" CREATION METHOD CALLED !!! ");
    }


    @PreDestroy
    public void beanDestruction() {

        System.out.println(" DESTRUCTION METHOD CALLED !!! ");
    }


    public String toString() {

        return " URL : " + url + " USERNAME : " + username + " PASSWORD : " + password;
    }
}
