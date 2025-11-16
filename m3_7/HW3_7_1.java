package m3_7;

public class HW3_7_1 {
    static class Wrapper<T> {
        private T item;

        public Wrapper(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }
    }

    public static void main(String[] args) {

        Wrapper<Integer> w1 = new Wrapper<>(10);
        Wrapper<String> w2 = new Wrapper<>("hello");

        // 1. Сырое сравнение
        System.out.println(w1 instanceof Wrapper); // true
        System.out.println(w2 instanceof Wrapper); // true

        // 2. Внутренний объект
        if (w1.getItem() instanceof Integer)
            System.out.println("w1 содержит Integer");

        if (w2.getItem() instanceof String)
            System.out.println("w2 содержит String");

        // 3. Можно проверять на Number, если параметр — подтип Number
        if (w1.getItem() instanceof Number)
            System.out.println("w1 содержит подтип Number");
    }
}
