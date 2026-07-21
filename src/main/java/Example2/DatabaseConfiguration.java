package Example2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConfiguration {


    @Value("${db.port}")
    private int port;

    @Value("${db.url}")
    private String url;

    @Value("${db.username}")
    private String username;

    @Value("${db.password}")
    private String password;


    @Autowired
    private DBProfile dbProfile;

    public DatabaseConfiguration() {

        System.out.println(" DatabaseConfiguration object is created  ");

    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
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

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DBProfile getDbProfile() {
        return dbProfile;
    }

    public void setDbProfile(DBProfile dbProfile) {
        this.dbProfile = dbProfile;
    }
}
