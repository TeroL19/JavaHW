package m10_1;

import java.io.FileInputStream;
import java.io.IOException;

public class HW10_1_4 {
    public static void main(String[] args) throws IOException {
        try (FileInputStream in = new FileInputStream("test.txt")) {
            System.out.println(in.read());
        } // здесь in.close() вызывается автоматически
    }
}
