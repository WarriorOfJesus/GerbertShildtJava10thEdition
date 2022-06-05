package chapter2;

// Продемострировать работу цикла for
public class ForTest {
    public static void main(String args[]) {
        int x;
        //for(x = 0; x < 10; x = x + 1)
        for (x = 0; x < 10; x++)
            System.out.println("meaning x: " + x);
        int c;
        for (c = 100; c > -101; c--)
            System.out.println("meaning c: " + c);
    }
}
