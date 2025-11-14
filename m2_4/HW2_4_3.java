public class HW2_4_3 {
    public static void main(String[] args) {
        Integer i = null; // объект, а не значение
        int x = i;        // попытка unboxing -> NullPointerException
    }
}
