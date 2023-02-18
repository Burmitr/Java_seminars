/*
Task 1. 
Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
*/
// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Collections;
/*
public class dz5 {

    static Map<String, ArrayList<String>> phoneBook = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        chooseOperation();
        for (Map.Entry<String, ArrayList<String>> contact : phoneBook.entrySet()) {
            System.out.printf("%s, %s\n", contact.getKey(), contact.getValue());
        }
    }

    private static void chooseOperation() {
        System.out.println("""
                Выберите действие:
                1 - создать контакт
                2 - обновить контакт
                3 - завершить работу""");

        String choice = scanner.nextLine();
        switch (choice) {
            case "1" -> createNewContact();
            case "2" -> editContact();
            case "3" -> System.out.println("Работа завершена!");
        }
    }

    private static void createNewContact() {
        System.out.print("Введите ФИО: ");
        String name = scanner.nextLine();

        if (phoneBook.containsKey(name)) {
            System.out.println("\n Такой контакт уже есть");
        } else {
            ArrayList<String> number = new ArrayList<>();
            System.out.print("Введите новый номер или q для возврата в меню: ");
            String input = scanner.nextLine();

            while (!input.equals("q")) {
                number.add(input);
                input = scanner.nextLine();
            }
            phoneBook.put(name, number);
        }
        chooseOperation();
    }

    private static void editContact() {
        System.out.print("Введите контакт: ");
        String name = scanner.nextLine();

        if (!phoneBook.containsKey(name)) {
            System.out.println("\nТакого контакта нет");
            chooseOperation();
        } else {
            System.out.print("Введите новый номер или q для возврата в меню: ");
            String number = scanner.nextLine();

            while (!number.equals("q")) {
                phoneBook.get(name).add(number);
                number = scanner.nextLine();
            }
            chooseOperation();
        }
    }
}
*/

/*
Task 2.
Пусть дан список сотрудников:Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
Отсортировать по убыванию популярности.
*/
/*
public class dz5 {
    static String s = """
            Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин,
            Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина,
            Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов""";
    static Map<String, Integer> employeesMap = new HashMap<>();

    public static void main(String[] args) {

        for (String line : s.split(", ")) {
            String name = line.split(" ")[0];

            if (!employeesMap.containsKey(name))
                employeesMap.put(name, 1);
            else
                employeesMap.put(name, employeesMap.get(name) + 1);
        }

        Map<Integer, ArrayList<String>> sortedMap = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : employeesMap.entrySet()) {
            if (entry.getValue() > 1) {
                if (!sortedMap.containsKey(entry.getValue()))
                    sortedMap.put(entry.getValue(), new ArrayList<>(List.of(entry.getKey())));
                else
                    sortedMap.get(entry.getValue()).add(entry.getKey());
            }
        }

        sortedMap = new TreeMap<>(sortedMap).descendingMap();

        for (int key : sortedMap.keySet()) {
            for (String val : sortedMap.get(key)) {
                System.out.printf("%s - %d\n", val, key);
            }
        }
    }
}
*/

/*
 * Task 3.
 * Реализовать алгоритм пирамидальной сортировки (HeapSort).
 */

/*
public class dz5 {
    static ArrayList<Integer> list = new ArrayList<>(
            List.of(11, 3, 5, 17, 28, 34, 3, 10, 8, 44, 18, 7, 13, 61));

    public static void main(String[] args) {
        System.out.println(list);

        ArrayList<Integer> sortedList = heapSort(list, list.size());
        System.out.println(sortedList);
    }

    private static ArrayList<Integer> heapSort(ArrayList<Integer> list, int length) {
        if (length == 1)
            return list;

        int lastParent = findLastParentIndex(length);

        for (int parent = lastParent; parent >= 0; parent--) {
            int leftChild = parent * 2 + 1;
            int rightChild = parent * 2 + 2;

            if (leftChild == length - 1)
                rightChild = leftChild;

            int max = leftChild;
            if (list.get(rightChild) > list.get(max))
                max = rightChild;

            if (list.get(parent) < list.get(max))
                swapIndexes(list, max, parent);
        }
        swapIndexes(list, 0, length - 1);
        return heapSort(list, length - 1);
    }

    private static void swapIndexes(ArrayList<Integer> list, int i, int j) {
        Collections.swap(list, i, j);
    }

    private static int findLastParentIndex(int listSize) {
        int i;
        if (listSize % 2 == 0) {
            i = (listSize - 1) / 2;
        } else {
            i = (listSize - 2) / 2;
        }
        return i;
    }
}
*/
