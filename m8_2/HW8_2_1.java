package m8_2;

public class HW8_2_1 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        // 1. Добавление в конец
        sb.append(" World");
        System.out.println(sb);

        // 2. Вставка по индексу (5)
        sb.insert(5, "_INSERT_");
        System.out.println(sb);

        // 3. Удаление части строки (с 5 до 13)
        sb.delete(5, 13);
        System.out.println(sb);

        // 4. Удаление символа (0)
        sb.deleteCharAt(0);
        System.out.println(sb);

        // 5. Замена части текста (с 0 до 4)
        sb.replace(0, 4, "Java");
        System.out.println(sb);

        // 6.Разворот строки
        sb.reverse();
        System.out.println(sb);
        sb.reverse(); // обратно

        // 7. Текущая вместимость буфера
        System.out.println("capacity: " + sb.capacity());

        // 8. Увеличение минимальной вместимости (до 100)
        sb.ensureCapacity(100);
        System.out.println("capacity after ensure: " + sb.capacity());

        // 9. Изменение длины строки (4)
        sb.setLength(4);
        System.out.println("setLength(4): " + sb);

        // 10. Чтение и изменение символа (по индексу 1 в X)
        sb.setCharAt(1, 'X');
        System.out.println("setCharAt: " + sb);
        System.out.println("charAt: " + sb.charAt(2));

        StringBuffer buffer = new StringBuffer("Buffer");
        buffer.append(" Example");
        System.out.println(buffer);
    }
}

