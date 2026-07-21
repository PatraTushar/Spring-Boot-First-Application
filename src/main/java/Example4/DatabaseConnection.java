package Example4;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//@Scope("prototype")
@Component
public class DatabaseConnection implements InitializingBean, DisposableBean {

    @Value("localhost:1521")
    private String url;
    private String username;
    private String password;

    public DatabaseConnection(){

        System.out.println(" Database Connection Created ");
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


    @Value("Tushar")
    public void setUsername(String username) {
        System.out.println(" setting username via setter ");
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public void afterPropertiesSet() throws Exception {

        // logic

        System.out.println(" This is afterProperties set called.... ");
    }


    @Override
    public void destroy() throws Exception {

        // logic

        System.out.println(" This is destroy method called ");
    }
}
