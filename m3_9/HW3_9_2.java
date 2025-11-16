package m3_9;

public class HW3_9_2 {
    enum Level {
        LOW(1),
        MEDIUM(5),
        HIGH(10);

        private final int power;

        Level(int power) {
            this.power = power;
        }

        // дополнительный метод
        public boolean isStrong() {
            return power >= 5;
        }

        public int getPower() {
            return power;
        }
    }
    public static void main(String[] args) {
        Level lvl = Level.HIGH;

        System.out.println("Уровень: " + lvl);
        System.out.println("Сила: " + lvl.getPower());
        System.out.println("Сильный?: " + lvl.isStrong());
    }
}
