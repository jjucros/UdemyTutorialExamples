package Lecture26;

/**
 * Created by Ze on 12/17/2014.
 */

class Frog {

    private int id;
    private String name;

    //Constructor
    public Frog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);
        return sb.toString();
    }


}

public class Lecture26_ToString {
    public static void main(String[] args) {
        Frog frog1 = new Frog(7, "Freddy");
        Frog frog2 = new Frog(5, "Roger");

        System.out.println(frog1.toString());
        System.out.println(frog2.toString());
    }


}
