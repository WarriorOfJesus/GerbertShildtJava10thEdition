package chapter3;
//вычислить расстояние, проходимые светом

public class TypeLong {
    public static void main(String args[]) {
        int lightspeed;
        long days;
        long seconds;
        long distance;
        // приблизительная скорость света, миль в секунду
        lightspeed = 186000;
        days = 7;// указать количество дней
        seconds = days * 24 * 60 * 60;
        //преобразовывваем секунды в секунды
        distance = lightspeed * seconds;
        //вычесляем расстояние
        System.out.print("in  " + days);
        System.out.print(" the days of light will pass about ");
        System.out.println(distance + " miles.");

    }
}

