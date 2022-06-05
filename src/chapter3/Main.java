package chapter3;

public class Main {
    public static void main(String[] args) {
        int y = 0;
        for (int x = 0; y < 1000; x++) {
            y = x * x;
            if (y < 1000) {
                System.out.println("x equals : " + x);
                System.out.println(y);
            }
        }
    }
}
