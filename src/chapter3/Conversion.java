package chapter3;

// продемострировать приведение типов
public class Conversion {
    public static void main(String args[]) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println(
                "\nConverting type int to type byte. ");
        b = (byte) i;
        System.out.println("i and b " + i + " " + b);
        System.out.println(
                "\nConverting type double to type int.");
        i = (int) d;
        System.out.println(" i and d " + d + " " + i);
        System.out.println(
                "\nConverting type double to type byte.");

        b = (byte) d;
        System.out.println("d and b " + d + " " + b);

    }
}
