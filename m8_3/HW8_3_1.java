package m8_3;

import java.util.Formatter;

public class HW8_3_1 {
    public static void main(String[] args) {
        Formatter f = new Formatter();

        boolean bool = true;
        int num = 42;
        double pi = 3.14159;
        char ch = 'A';
        String text = "Hello";

        f.format("Boolean: %b%n", bool); // %b - логическое значение
        f.format("Decimal: %d%n", num); // %d - десятичное целое
        f.format("Float: %f%n", pi); // %f - число с плавающей точкой
        f.format("Char: %c%n", ch); // %c - символ
        f.format("String: %s%n", text); // %s - строка

        System.out.println(f);
        f.close();
    }
}
