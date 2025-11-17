package m4_4;

public class HW4_4_3 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent child = new Child();
        parent.process();
        child.process();
    }
}

class Parent {
    void process() {}
}

class Child extends Parent {
    // Ошибка: опечатка в названии метода
    @Override
    void proccess() {} // компилятор выдаст ошибку

    // Без @Override ошибка бы не возникла,
    // метод просто не переопределился, 
    // что привело бы к неверному поведению программы.
}