package Example5;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


// @Scope("prototype")
@Component
public class EmailConnection {



    public EmailConnection(){

        System.out.println(" EmailConnection object is created ");
    }


    @PostConstruct
    public void logicBeanCreation(){

        // logic

        System.out.println(" This is lifecycle method : After construction And Configuration ");

    }


    @PreDestroy
    public void logicOfBeanDestruction(){

        // logic

        System.out.println(" This is lifecycle method : Before Destruction And Configuration ");
    }



}
