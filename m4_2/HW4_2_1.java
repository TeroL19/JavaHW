package m4_2;

public class HW4_2_1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.sayHello();
    }
}

class Parent {
    public final void sayHello() {
        System.out.println("Hello from Parent!");
    }
}

class Child extends Parent {
    // Попытка переопределения final-метода - ошибка компиляции
    @Override
    public void sayHello() {
        System.out.println("Hello from Child!");
    }
}
