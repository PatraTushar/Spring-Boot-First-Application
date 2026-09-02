package Injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    private Engine engine;
    private Tyre tyre;

    private MusicSystem musicSystem;

    @Autowired
    public Car(Tyre tyre) {

        this.tyre = tyre;


    }

    @Autowired
    public void setMusicSystem(MusicSystem musicSystem) {
        this.musicSystem = musicSystem;
    }


    public void  drive(){

        engine.start();
        tyre.rotate();
        musicSystem.play();

        System.out.println(" car is driving ");
    }
}
