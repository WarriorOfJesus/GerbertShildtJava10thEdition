package chapter2;

/*
это еще один пример простой программы
*/
public class SecondExempleOfSimpleProgram {
    public static void main(String args[]) {
        int num;// обьявляем переменную с именем num
        num = 100;// привсаеваем num значение 100
        System.out.println("Это переменная num: " + num);
        num = num * 2;
        System.out.print("Значение перемненной num * 2 равно " + num);
        System.out.println(num);
        if (num > 100) System.out.println("num more 100");


    }
}
