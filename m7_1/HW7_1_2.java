package m7_1;

interface A {
    default void hello() {
        System.out.println("Hello from A");
    }
}

interface B {
    default void hello() {
        System.out.println("Hello from B");
    }
}

class C implements A, B {
    // Обязательное переопределение, иначе ошибка компиляции
    @Override
    public void hello() {
        // Можно выбрать, какой default-метод использовать:
        A.super.hello(); // вызов реализации из A
        // или B.super.hello();
    }
}

public class HW7_1_2 {
    public static void main(String[] args) {
        C c = new C();
        c.hello(); // вызовет реализацию из A
    }
}
