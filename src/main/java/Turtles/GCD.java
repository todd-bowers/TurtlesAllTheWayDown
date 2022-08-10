package Turtles;

public class GCD {
    public static Integer greatest(Integer a, Integer b) {
        if (b == 0) return a;
        return greatest(b, a%b);
    }
}
