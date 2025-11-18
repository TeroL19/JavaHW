package m7_1;

interface MyInterface {
    // default - обычный неабстрактный метод
    default void sayHello() {
        System.out.println("Hello from default method in interface");
    }

    // static - вызывается только через имя интерфейса
    static void staticMethod() {
        System.out.println("Static method in interface");
    }
}

class MyClass implements MyInterface {

    // Переопределяем default-метод (не обязательно)
    @Override
    public void sayHello() {
        System.out.println("Hello from MyClass");
    }
}

public class HW7_1_1 {
    public static void main(String[] args) {

        MyClass obj = new MyClass();

        // Вызов default метода (как обычного метода объекта)
        obj.sayHello();

        // Вызов static метода из интерфейса
        MyInterface.staticMethod();
    }
}

