package m10_1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class HW10_1_2 {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        output.write(65); // записываем 'A'
        output.write(66); // 'B'
        output.write(67); // 'C'

        byte[] result = output.toByteArray();
        System.out.println(new String(result)); // ABC

        output.close();
    }
}
