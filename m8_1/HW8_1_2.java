package m8_1;

import java.util.StringJoiner;

public class HW8_1_2 {
    public static void main(String[] args) {

        // 1. Простой разделитель
        StringJoiner joiner1 = new StringJoiner(", ");
        joiner1.add("Apple");
        joiner1.add("Banana");
        joiner1.add("Orange");
        System.out.println(joiner1);

        // 2. С префиксом и суффиксом
        StringJoiner joiner2 = new StringJoiner(", ", "[", "]");
        joiner2.add("A").add("B").add("C");
        System.out.println(joiner2);

        // 3. Объединение нескольких joiner'ов
        StringJoiner j1 = new StringJoiner("-");
        j1.add("1").add("2");

        StringJoiner j2 = new StringJoiner("-");
        j2.add("3").add("4");

        j1.merge(j2); // 1-2-3-4
        System.out.println(j1);
    }
}

