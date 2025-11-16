package m3_7;

import java.util.*;

public class HW3_7_2 {

    public static void main(String[] args) {

        // Если мы не знаем точный подтип (Integer, Double, Long), но хотим читать как Number.

        List<? extends Number> list1 = List.of(1, 2.5, 10L);

        Number x = list1.get(0); // Достаём как Number

        // list1.add(5); // Ошибка
        // list1.add(new Integer(5)); // Ошибка

    

        // Если нужно класть Integer, но точно не знаем, что там: List<Object>, List<Number> или List<Integer>.

        List<? super Integer> list2 = new ArrayList<>();

        list2.add(10);
        list2.add(100);

        Object obj = list2.get(0); // Достаём только как Object
    }
}

