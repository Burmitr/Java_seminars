import java.util.Scanner;

/*
Задание 1
Дано четное число N(>0)и символы c1 и c2. Написать метод,который вернет строку длины N,которая состоит 
из чередующихся символов c1 и c2,начиная с c1.
*/

public class sem2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int num = scanner.nextInt();
        String c1 = "c1";
        String c2 = "c2";
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i <= num; i+=2){
            sb.append(c1).append(c2);
        }
        System.out.println(sb);
        
    
    }
}
