package Lecture27;

/**
 * Created by Ze on 12/17/2014.
 */
public class Car extends Machine {


    @Override
    public void Start() {
        System.out.println("Car Started");
    }

    @Override
    public void Stop() {
        System.out.println("Car Sttoped");
    }

    public void wipeWindShield() {
        System.out.println("Wiping windshield");
    }

    public void showInfo() {
        System.out.println("Name: \t " + name);
    }
}
