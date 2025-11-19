package m8_3;

import java.util.Formatter;
import java.util.Date;

public class HW8_3_3 {
    public static void main(String[] args) {
        Formatter f = new Formatter();
        Date now = new Date();

        f.format("Час (24ч): %tH%n", now); // %tH - часы (00–23)
        f.format("Минуты: %tM%n", now); // %tM - минуты
        f.format("Секунды: %tS%n", now); // %tS - секунды
        f.format("Полный месяц: %tB%n", now); // %tB - название месяца
        f.format("Год (4 знака): %tY%n", now); // %tY - год полностью

        System.out.println(f);
        f.close();
    }
}
