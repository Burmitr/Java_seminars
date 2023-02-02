import java.util.Scanner;

/*
 * Задание 3
 * Напишите метод, который принимает на вход строку (String) и определяет
 * является ли строка палиндромом (возвращает boolean значение).
 */

public class sem2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String s = input.trim().replace(" ", "");
        System.out.println(s);

        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());

        if (sb.toString().equals(s)) {
            System.out.println("Полиндром");
        } else
            System.out.println("Нет");
    }
}

