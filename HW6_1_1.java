class Parent {
    public void hello() {}
    @Deprecated // Метод объявлен устаревшим
    public void oldMethod() {}
}

class Child extends Parent {

    @Override // Компилятор проверяет, что метод существует в Parent
    public void hello() {
        System.out.println("Hello from Child");
    }

    @SuppressWarnings("deprecation") // Скрываем предупреждение о вызове устаревшего метода
    public void useOld() {
        oldMethod(); // Без SuppressWarnings здесь будет предупреждение
    }
}

public class HW6_1_1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.hello();
        c.useOld();
    }
}
