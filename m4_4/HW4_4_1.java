package m4_4;

public class HW4_4_1 {
    public static void main(String[] args) {
        MathUtil math = new MathUtil();
        math.sum(1, 2);
        math.sum(0.5, 2.1);
        math.sum(1, 2, 3);
    }
}

class MathUtil {
    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
