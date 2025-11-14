public class HW2_7_2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) break;  // остановка цикла
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) continue; // пропустить чётные числа
            System.out.println(i);
        }
        
    }
}
