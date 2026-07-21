package Example6;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component
public class EmailConfiguration {

    public EmailConfiguration(){

        System.out.println(" EmailConfiguration object is created ");
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


    public void email2LifeCycle(){

        System.out.println(" email2Lifecycle.....");
    }

    public void email2LifeCycleDestroy(){

        System.out.println(" email2LifeCycle Destroyed ");
    }

}
