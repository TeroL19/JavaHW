public class HW2_3_2 {
    public static void main(String[] args) {
        String text = "Привет";
        Object obj = text; // объект класса String
        Integer number = 10;
        Object nullObj = null;

        // Проверки instanceof
        System.out.println("obj instanceof String: " + (obj instanceof String));     // true
        System.out.println("obj instanceof Object: " + (obj instanceof Object));     // true

        // null
        System.out.println("nullObj instanceof Object: " + (nullObj instanceof Object)); // false
    }
}
