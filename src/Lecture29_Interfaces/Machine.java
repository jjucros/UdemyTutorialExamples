package Lecture29_Interfaces;

/**
 * Created by Ze on 12/17/2014.
 */
public class Machine implements Info {

    private int id = 7;

    public void Start() {
        System.out.println("Machine Started");

    }

    @Override
    public void showInfo() {

    }
}
