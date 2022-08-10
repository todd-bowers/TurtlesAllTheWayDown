package Turtles;

/**
 * Created by kristofer on 7/14/20.
 */
public class Turtles {

    public static int factorial(int integer) {
        if (integer == 1) return 1;
        return integer * factorial(integer - 1);
//        int counter = 1;
//        int total = 1;
//        while(counter <= integer) {
//            total *= counter;
//            counter++;
//        }
//        return total;
    }
}
