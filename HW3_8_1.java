public class HW3_8_1 {
    static class Printer {
        // 1. Переменное число int
        public void print(int... nums) {
            System.out.println("int... версия:");
            for (int x : nums) {
                System.out.println(x);
            }
        }

        // 2. Переменное число String
        public void print(String... strs) {
            System.out.println("String... версия:");
            for (String s : strs) {
                System.out.println(s);
            }
        }

        // 3. Перегрузка: один int
        public void print(int x) {
            System.out.println("один int:");
            System.out.println(x);
        }

        // 4. Перегрузка: один Object
        public void print(Object o) {
            System.out.println("Object версия:");
            System.out.println(o);
        }
    }

    public static void main(String[] args) {

        Printer p = new Printer();

        p.print(1, 2, 3); // print(int...)
        p.print("a", "b", "c"); // print(String...)
        p.print(10); // print(int)
        p.print(new Object()); // print(Object)
    }
}

