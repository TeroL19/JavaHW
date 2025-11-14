public class HW2_6_1 {
    public static void main(String[] args) {
        // byte
        byte b = 2;
        switch (b) {
            case 1: System.out.println("b = 1"); break;
            case 2: System.out.println("b = 2"); break;
        }

        // short
        short s = 5;
        switch (s) {
            case 5: System.out.println("s = 5"); break;
        }

        // char
        char c = 'A';
        switch (c) {
            case 'A': System.out.println("A"); break;
            case 'B': System.out.println("B"); break;
        }

        // int
        int i = 10;
        switch (i) {
            case 10: System.out.println("i = 10"); break;
        }

        // enum
        enum Day { MONDAY, TUESDAY }
        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY: System.out.println("Понедельник"); break;
            case TUESDAY: System.out.println("Вторник"); break;
        }

        // String
        String text = "hi";
        switch (text) {
            case "hi": System.out.println("Привет!"); break;
            case "bye": System.out.println("Пока!"); break;
        }
    }

}
