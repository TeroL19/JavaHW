interface MyInterface {
    class Helper {
        public void sayHello() {
            System.out.println("Hello from nested class inside interface!");
        }
    }
}

public class HW5_2_1 {
    public static void main(String[] args) {
        // вызов метода вложенного класса
        MyInterface.Helper h = new MyInterface.Helper();
        h.sayHello();
    }
}
