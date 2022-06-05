package chapter3;

public class Scope {
    public static void main(String args[]) {
        int x = 10;
        if (x == 10) { //начало новой области дествия,
            int y = 20; // доступной только этому блоку
            /*обе перерменныке доступны
             в этой области дейстивя */
            System.out.println(" x and y: " + x + " " + y);
            x = y * 2;
        }
        //y = 100; а тут уже ошибка
        // пееменная y не будет действительна здесь
        // а x будет работать здесь т к мы заявили о нем до if
        System.out.println("x : " + x);
    }
}
