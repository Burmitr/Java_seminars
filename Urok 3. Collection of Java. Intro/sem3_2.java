import java.util.ArrayList;
import java.util.Arrays;

/*
 * 2.1 Заполнить список названиями планет Солнечной системы в произвольном
 * порядке с повторениями. Вывести название каждой планеты и количество его
 * повторений в списке.
 */

public class sem3_2 {

    public static void main(String[] args) {
        String[] planets = new String[] { "Меркурий", "Венера", "Земля", "Марс", "Уран", "Меркурий", "Юпитер", "Сатурн",
                "Земля", "Уран", "Меркурий", "Нептун", "Земля", "Земля"};
        ArrayList<String> sunSistem = new ArrayList<>(Arrays.asList(planets));
        System.out.println(sunSistem);

        ArrayList<String> copySunSistem = new ArrayList<>(sunSistem);

        int counter = 0;

        for (String planet : copySunSistem) {
            counter = 0;
            for (String planetName : sunSistem) {
                if (planetName.equals(planet)) {
                    counter++;
                }
            }
            System.out.printf("%s - %d\n", planet, counter);
        }
    }
}

/*
 * 2.2 Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
 * 3. Создать список типа ArrayList<String>. Поместить в него как строки, так и
 * целые числа. Пройти по списку, найти и удалить целые числа.
 * 4. Каталог товаров книжного магазина сохранен в виде двумерного списка
 * List<ArrayList<String>> так, что на 0й позиции каждого внутреннего списка
 * содержится название жанра, а на остальных позициях - названия книг. Напишите
 * метод для заполнения данной структуры.
 */
