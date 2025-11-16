package m3_9;

public class HW3_9_1 {
    // перечисление с инициализацией
    enum Day {
        MONDAY("Рабочий день", 1),
        TUESDAY("Рабочий день", 2),
        SATURDAY("Выходной", 6),
        SUNDAY("Выходной", 7);

        private final String type;
        private final int number;

        // конструктор перечисления (всегда private)
        Day(String type, int number) {
            this.type = type;
            this.number = number;
        }

        public String getType() {
            return type;
        }

        public int getNumber() {
            return number;
        }
    }
    public static void main(String[] args) {
        Day d = Day.SATURDAY;
        System.out.println(d + " — " + d.getType() + ", номер=" + d.getNumber());
    }
}
