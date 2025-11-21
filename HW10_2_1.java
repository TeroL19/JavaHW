import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HW10_2_1 {
    public static void main(String[] args) {
        try {
            Scanner fileScanner = new Scanner(new File("data.txt"));

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine(); // читаем строку
                System.out.println(line);
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
    }
}
