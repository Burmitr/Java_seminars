import java.util.Scanner;
import java.time.LocalTime;

public class task1 {

    public static void main(String[] args) {
        // System.out.println("Alloha world!");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = scan.nextLine();
        scan.close();

        int hour = LocalTime.now().getHour();
        // System.out.println(hour);
        if (hour >= 5 && hour < 12) {
            System.out.printf("Доброе утро, %s!", name);
        }
        if (hour >= 12 && hour < 18) {
            System.out.printf("Добрый день, %s!", name);
        }
        if (hour >= 18 && hour < 23) {
            System.out.printf("Добрый вечер, %s!", name);
        }
        if (hour >= 23 && hour < 5) {
            System.out.printf("Доброй ночи, %s!", name);
        }
    }
}