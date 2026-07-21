package Example1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Garage {


    @Autowired
    private Vehicle vehicle;

    public Garage() {

        System.out.println(" Garage Object is created ");
    }

    public Garage(Vehicle vehicle){

        System.out.println(" Garage object is created and injected with vehicle "+vehicle.getClass());
    }


    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
