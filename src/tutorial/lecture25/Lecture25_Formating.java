package tutorial.lecture25;

/**
 * Created by Ze on 12/17/2014.
 */
public class Lecture25_Formating {
    public static void main(String[] args) {

        //Inefficent
        String info = "";
        info += "My name in Sue.";
        info += " ";
        info += "I am a builder.";

        System.out.println("info = " + info);


        //More efficient
        StringBuilder sb = new StringBuilder("");

        sb.append("My name in Bob.");
        sb.append(" ");
        sb.append("I am a lion tamer");

        System.out.println("sb = " + sb);

        //Nice way to append string
        StringBuilder s = new StringBuilder("");

        s.append("My name in Roger.")
                .append(" ")
                .append("I am a skydiver");
        System.out.println("s = " + s);


        //-- Formating --//
        System.out.println("Here is some text. \tThan was a tab. \nThat was a newLine");
        System.out.println("\tMore text");

        //-- Formating Integers
        System.out.printf("Total cost %-10d; quuantity is %d\n", 5, 120);


        //-- Formation strings --//
        for (int i = 0; i < 20; i++) {
            System.out.printf("%2d: %s\n", i, "some text here ");
        }

        //-- Formation floating point --//

        System.out.printf("Total value: %.2f \n", 5.6874);
        System.out.printf("Total value: %.3f \n", 343.23423);


    }
}
