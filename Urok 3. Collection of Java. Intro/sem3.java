import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

// 1 Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.

public class sem3 {

   public static void main(String[] args) {
      ArrayList<Integer> arr = new ArrayList<Integer>();

      Random random = new Random();

      for (int i = 0; i < 10; i++) {
         arr.add(random.nextInt(20));
      }

      System.out.println(arr);
      Collections.sort(arr);
      System.out.println(arr);
   }
}

