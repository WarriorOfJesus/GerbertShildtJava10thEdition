package chapter3;

/*
продемонстрировать применение блока кода
 */
public class ApplicationOfBlocks {
    public static void main(String args[]) {
        int x, y;
        y = 220;
        for (x = 0; x < 120; x++) {
            System.out.println("meaning x: " + x);
            System.out.println("meaning y: " + y);
            y = y - 1;
        }
    }
}