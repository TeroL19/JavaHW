package m5_1;

public class HW5_1_3 {
    public static void main(String[] args) {
        new Outer().test();
    }
}

class Outer {
    class Inner {
        private int secret = 100;
        public int open = 200;
    }

    void test() {
        Inner in = new Inner();
        // System.out.println(in.secret); // ошибка - private
        System.out.println(in.open); // public - доступ разрешён
    }
}
