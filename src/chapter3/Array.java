package chapter3;

// в этом примере расмотрим как работает одномерный массив
public class Array {
    public static void main(String args[]) {
        int mounth_days[];
        mounth_days = new int[12];
        mounth_days[0] = 31;
        mounth_days[1] = 28;
        mounth_days[2] = 31;
        mounth_days[3] = 30;
        mounth_days[4] = 31;
        mounth_days[5] = 30;
        mounth_days[6] = 31;
        mounth_days[7] = 30;
        mounth_days[8] = 31;
        mounth_days[9] = 30;
        mounth_days[10] = 31;
        mounth_days[11] = 30;
        System.out.println("В арпреле " + mounth_days[3] + "дней.");

    }
}
