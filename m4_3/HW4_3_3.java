package m4_3;

class A {
    int a;
    int b;
    int c;
    int z;

    public A() {
        this(0, 0, 0); // Вызов самого полного конструктора
    }

    public A(int a) {
        this(a, 0, 0); // Вызов полного конструктора
    }

    public A(int a, int b) {
        this(a, b, 0); // Вызов полного конструктора
    }

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.z = 1;
    }
}


public class HW4_3_3 {
    
}
