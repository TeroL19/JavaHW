public class HW2_3_1 {
    public static void main(String[] args) {

        // Операторы присваивания
        int a = 10;
        int b = 5;
        a += b;
        a -= 3;
        a *= 2;
        a /= 4;
        a %= 4;

        // Тернарный оператор
        int x = 10;
        int y = 20;
        int max = (x > y) ? x : y;
        System.out.println("max = " + max);

        // Логические операторы
        boolean cond1 = true;
        boolean cond2 = false;

        System.out.println("cond1 && cond2 = " + (cond1 && cond2));
        System.out.println("cond1 || cond2 = " + (cond1 || cond2));
        System.out.println("!cond1 = " + (!cond1));

        // Побитовые операторы
        int bitA = 5;
        int bitB = 3; 

        System.out.println("bitA & bitB = " + (bitA & bitB)); 
        System.out.println("bitA | bitB = " + (bitA | bitB));
        System.out.println("bitA ^ bitB = " + (bitA ^ bitB));
        System.out.println("~bitA = " + (~bitA));    

        // Операторы сравнения
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y)); 
        System.out.println("x <= y: " + (x <= y));

        // Сдвиги
        int num = 8;
        System.out.println("num << 1 = " + (num << 1));  
        System.out.println("num >> 1 = " + (num >> 1));
        System.out.println("num >>> 1 = " + (num >>> 1));

        // Арифметические операторы
        int sum = 5 + 3;     // 
        int diff = 5 - 3;    // 2
        int prod = 5 * 3;    // 15
        int div = 5 / 2;     // 2 (целое деление)
        int mod = 5 % 2;     // 1

        System.out.println("sum = " + sum + ", mod = " + mod);

        // Инкремент и декремент
        int count = 10;
        System.out.println("Постфиксный инкремент: " + (count++)); // вывод 10, потом count = 11
        System.out.println("Префиксный инкремент: " + (++count));  // сначала count = 12, потом вывод
        System.out.println("Постфиксный декремент: " + (count--)); // вывод 12, потом count = 11
        System.out.println("Префиксный декремент: " + (--count));  // сначала count = 10, потом вывод

        // Конкатенация строк
        String firstName = "Илья";
        String lastName = "Герасимов";
        String fullName = firstName + " " + lastName;
        fullName += " (студент)";                    
        System.out.println(fullName);

        // Приоритет операторов
        int result = 5 + 3 * 2; // сначала *, потом +
        System.out.println("5 + 3 * 2 = " + result);
        int grouped = (5 + 3) * 2;
        System.out.println("(5 + 3) * 2 = " + grouped);
    }
}
