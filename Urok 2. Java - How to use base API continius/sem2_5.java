import java.io.FileWriter;

/*
 * Задание 4
 * Напишите метод, который составит строку, состоящую из 100 повторений слова
 * TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
 */


public class sem2_5 {
    public static void main(String[] args) throws Exception {
        String str = "TEST ";
        int num = 100;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            sb.append(str);
        }

        String words = sb.toString();

        FileWriter writer =  new FileWriter("text");
        writer.write(words);
        writer.flush();
        writer.close();
    }
}
