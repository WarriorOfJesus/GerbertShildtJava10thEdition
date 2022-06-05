package chapter3;

// применение и значение типа boolean
public class TypeBoolean {
    public static void main(String args[]) {
        boolean b;
        b = false;
        System.out.println("b equals =" + b);
        b = true;
        System.out.println("b equels = " + b);
        //значение типа boolean  может управлять оператором if
        if(b) System.out.println("this code is exeduted");
        b = false;
        System.out.println("this code isn't exeduted ");
        // редлзультат сравнения - значение boolean
        System.out.println("10 > 9 equals "+ (10>9));
    }
}