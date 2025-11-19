package m8_1;

public class HW8_1_1 {
    public static void main(String[] args) {

        String s = "  Hello World  ";

        // 1. Длина строки
        System.out.println("length: " + s.length());

        // 2. Удаляет пробелы по краям
        System.out.println("trim: *" + s.trim() + "*");

        // 3. Перевод в верхний регистр
        System.out.println("upper: " + s.toUpperCase());

        // 4. Перевод в нижний регистр
        System.out.println("lower: " + s.toLowerCase());

        // 5. Символ по индексу
        System.out.println("charAt(2): " + s.charAt(2));

        // 6. Подстрока
        System.out.println("substring(2,7): " + s.substring(2, 7));

        // 7. Проверка вхождения
        System.out.println("contains \"World\": " + s.contains("World"));

        // 8. Замена
        System.out.println("replace: " + s.replace("World", "Java"));

        // 9. Поиск индекса подстроки
        System.out.println("indexOf \"o\": " + s.indexOf("o"));

        // 10. Разбиение строки
        String[] parts = s.trim().split(" ");
        System.out.println("split: " + parts[0] + " / " + parts[1]);
    }
}
