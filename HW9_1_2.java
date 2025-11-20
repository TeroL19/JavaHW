public class HW9_1_2 {
    public static void main(String[] args) {

        // ArithmeticException
        try {
            int x = 10 / 0; // Деление на 0
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException пойман: " + e.getMessage());
        }

        // ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            int a = arr[5]; // Индекс вне диапазона
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException пойман: " + e.getMessage());
        }

        // IllegalArgumentException
        try {
            setAge(-5); // Ошибочный аргумент
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException пойман: " + e.getMessage());
        }

        // ClassCastException
        try {
            Object obj = "Hello";
            Integer num = (Integer) obj; // Неправильное приведение типов
        } catch (ClassCastException e) {
            System.out.println("ClassCastException пойман: " + e.getMessage());
        }

        // NullPointerException
        try {
            String s = null;
            int len = s.length(); // Обращение к null
        } catch (NullPointerException e) {
            System.out.println("NullPointerException пойман: " + e.getMessage());
        }
    }

    // Метод, специально выбрасывающий IllegalArgumentException
    static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным!");
        }
    }
}
