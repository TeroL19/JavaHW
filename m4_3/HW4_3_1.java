package m4_3;

class Parent {
    int x = 10;

    Parent() {
        System.out.println("Конструктор Parent");
    }

    void sayHello() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    int x = 20;

    Child() {
        super(); // 1) Вызов конструктора суперкласса
        System.out.println("Конструктор Child");
    }

    void printValues() {
        System.out.println(super.x); // 2) Обращение к полю суперкласса
        super.sayHello();            // 3) Вызов метода суперкласса
    }
}

public class HW4_3_1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.printValues();
    }
}
