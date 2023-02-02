import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.IOException;
import java.io.FileWriter;

/*
Задача 1 
Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

Задача 2
К калькулятору из предыдущего дз добавить логирование.
*/

// Задача 1
/*
public class dz2 {
    public static void main(String[] args) {
        int[] mass = { 3, 7, 1, 4, 9, 2, 6 };

        boolean isSorted = false;
        int temp;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mass.length - 1; i++) {
                if (mass[i] > mass[i + 1]) {
                    isSorted = false;
                    temp = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(mass));
    }
}
*/

// Задача 2
public class dz2 {
    public static void main(String[] args) throws Exception {

        Double result;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите действие (' + ', ' - ', ' * ', ' / '): ");
        String action = scanner.nextLine();
        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        if (action.equals("+")) {
            result = a + b;
            System.out.println(a + " + " + b + " = " + result);

        }
        if (action.equals("-")) {
            result = a - b;
            System.out.println(a + " - " + b + " = " + result);
        }
        if (action.equals("*")) {
            result = a * b;
            System.out.println(a + " * " + b + " = " + result);
        }
        if (action.equals("/")) {
            result = a / b;
            System.out.println(a + " / " + b + " = " + result);
        }

        Logger logger = Logger.getLogger(dz2.class.getName());
        try {
			FileHandler fh = new FileHandler("log.txt");
			logger.addHandler(fh);
			
		} catch (SecurityException e) {
			logger.log(Level.SEVERE,
					"Не удалось создать файл лога из-за политики безопасности.", 
					e);
		} catch (IOException e) {
			logger.log(Level.SEVERE,
					"Не удалось создать файл лога из-за ошибки ввода-вывода.",
					e);
		}
		
		logger.log(Level.INFO, "Запись лога с уровнем INFO (информационная)");
		logger.log(Level.WARNING,"Запись лога с уровнем WARNING (Предупреждение)");
		logger.log(Level.SEVERE, "Запись лога с уровнем SEVERE (серъёзная ошибка)");
	}
    }

