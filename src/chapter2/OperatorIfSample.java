package chapter2;

public class OperatorIfSample {
    public static void main(String args[]) {
        int x, y;
        x = 10;
        y = 20;
        if (x < y) System.out.println("x smaller y");
        x = x * 2;
        if (x == y) System.out.println("x now equals y");
        x = x * 2;
        if (x > y) System.out.println("x now bigger y");
    }

}
