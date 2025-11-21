package m10_1;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class HW10_1_1 {
    public static void main(String[] args) throws IOException {
        byte[] data = {65, 66, 67}; // A, B, C
        ByteArrayInputStream input = new ByteArrayInputStream(data);

        int value;
        while ((value = input.read()) != -1) { // read() читает 1 байт
            System.out.println((char) value);
        }
        input.close();
    }
}
