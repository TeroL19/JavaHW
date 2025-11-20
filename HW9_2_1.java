
public class HW9_2_1 {
    public static void main(String[] args) {

        try {
            // Перехватывается
            int x = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Перехвачено: " + e);
        }

        // Не перехватывается
        String s = null;
        System.out.println(s.length()); // Аварийное завершение

        System.out.println("Эта строка уже не выполнится");
    }
}
