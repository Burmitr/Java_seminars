/*
Task 1.
Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
public class dz4 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите несколько элементов, нажмите 'q' для выхода:\n ");
        while (true) {
            String input = scanner.nextLine();
            if ("q".equals(input))
                break;
            else {
                ll.offer(input);
                System.out.print("--> ");
            }
        }
        System.out.println("Входной list: " + ll);
        System.out.println("Перевернутый list: " + reverseList(ll));

    }

    private static LinkedList<String> reverseList(LinkedList<String> ll) {
        
        for (int i = 0; i < ll.size() / 2; i++) {
            Collections.swap(ll, i, ll.size() - 1 - i);
        }
        return ll;
    }
}
*/

/*
 * Task 2.
 * Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() -
 * помещает элемент в конец очереди,
 * dequeue() - возвращает первый элемент из очереди и удаляет его, first() -
 * возвращает первый элемент
 * из очереди, не удаляя.
*/

/*
public class dz4 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>(List.of("elem1", "elem2"));
        System.out.println(ll);

        enqueue(ll, "elem3");
        System.out.println(dequeue(ll));
        System.out.println(first(ll));

        System.out.println(ll);
    }

    private static String first(LinkedList<String> list) {
        return list.element();
    }

    private static String dequeue(LinkedList<String> list) {
        return list.poll();
    }

    private static void enqueue(LinkedList<String> list, String el) {
        list.add(el);
    }
}

*/

/*
 * Task 3.
 * В калькулятор добавьте возможность отменить последнюю операцию.
 */
/*
public class dz4 {
    static float first_num;
    static float second_num;
    static char operator;
    static Logger logger = Logger.getLogger(dz4.class.getName());

    public static void main(String[] args) throws Exception {

        FileHandler ch = new FileHandler("CalculatorLogger.log");
        logger.addHandler(ch);
        logger.setUseParentHandlers(false);
        logger.setLevel(Level.WARNING);

        getExpression();
    }

    static void execute_calculation(float x, float y, char operator) {
        switch (operator) {
            case '+' -> System.out.printf("%.2f + %.2f = %.2f", x, y, x + y);
            case '-' -> System.out.printf("%.2f - %.2f = %.2f", x, y, x - y);
            case '*' -> System.out.printf("%.2f * %.2f = %.2f", x, y, x * y);
            case '/' -> {
                try {
                    System.out.printf("%.2f / %.2f = %.2f", x, y, x / y);
                } catch (Exception e) {
                    System.out.println("На ноль делить нельзя!");
                    logger.warning(Arrays.toString(e.getStackTrace()));
                }
            }
            case '%' -> System.out.printf("%.2f %% %.2f = %.2f", x, y, x % y);
        }
    }

    static void getExpression() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        String input = scanner.nextLine();
        try {
            first_num = Float.parseFloat(input);
            getSecondNum();
        } catch (NumberFormatException e) {
            logger.warning(Arrays.toString(e.getStackTrace()));
            System.out.print("Думаю это не число! Попробуй ещё раз: ");
            getExpression();
        }
    }

    static void getSecondNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите второе число (back - отмена предыдущего ввода)");
        String input = scanner.nextLine();
        if (input.equals("back")) {
            getExpression();
        } else {
            try {
                second_num = Float.parseFloat(input);
                getOperator();
            } catch (NumberFormatException e) {
                logger.warning(Arrays.toString(e.getStackTrace()));
                System.out.print("Думаю это не число! Попробуй ещё раз: ");
                getSecondNum();
            }
        }
    }

    static void getOperator() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> operators = new ArrayList<>(List.of("+", "-", "*", "/", "%"));

        System.out.println("Выберите действие +, -, *, / или % (back - для отмена ввода)");
        String input = scanner.nextLine();
        if (input.equals("back")) {
            getSecondNum();
        } else if (operators.contains(input)) {
            operator = input.charAt(0);
            execute_calculation(first_num, second_num, operator);
        } else {
            logger.warning("Invalid operator entered");
            System.out.println("Это не оператор! Введите еще раз: ");
            getOperator();
        }
    }
}
*/