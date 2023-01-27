import java.util.Scanner;

/*
Задача 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
Задача 2. Вывести все простые числа от 1 до 1000
Задача 3. Реализовать простой калькулятор
*/


//Задача 1

public class dz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        int summN = 0;
        int mult = 1;

        for(int i = 1; i <= n; i++){
			summN = summN + i;
		}
		System.out.printf("Сумма чисел от 1 до "+n+" = "+summN);
        System.out.println();

        for(int i = 1; i <= n; i++){
			mult = mult * i;
		}
		System.out.printf("Произведение чисел от 1 до "+n+" = "+mult);
    }
}



 //  Задача 2. Вывести все простые числа от 1 до 1000
/*public class dz {
    public static void main(String[] args) {

        int a = 1000;
        
        for (int i = 1; i < a; i++) {
            if (i % 2 == 0) {
                System.out.print(" "+i);
            }
        }
    }
}
*/



// Задача 3. Реализовать простой калькулятор
/*public class dz {
    public static void main(String[] args) {

        int result = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Укажите действие (' + ', ' - ', ' * ', ' / '): ");
        String action = scanner.next();
       
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
    }
}
*/