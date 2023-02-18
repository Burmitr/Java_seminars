package dz3;

import java.util.Random;
import java.util.Scanner;

// Задание 2. Пусть дан произвольный список целых чисел, удалить из него четные числа

public class dz3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input length of array: ");
        int listArrayLength = scanner.nextInt();

        Random random = new Random();
        for (int i = 0; i < listArrayLength; i++) {
            array[i] = random.nextInt(100);
        }
    }
}
