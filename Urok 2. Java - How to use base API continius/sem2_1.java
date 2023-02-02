import java.io.FileWriter;
import java.util.logging.Logger;

public class sem2_1 {
    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("hello")) {

            // запись строки в файл
            String text = "Hello World!";
            writer.write(text);

            // запись по символам
            writer.append('\n');
            writer.append('E');

            writer.flush(); // flush очищает после кеш после записи и освобождает ресурсы

        } catch (Exception exception) {
        }
        Logger logger = Logger.getAnonymousLogger();
        logger.info("We wrote a file");

    }

}