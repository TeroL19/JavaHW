package m4_4;

public class HW4_4_2 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        animal.sound();
        dog.sound();
    }
}

class Animal {
    String sound() {
        return "Some sound";
    }
}

class Dog extends Animal {
    @Override
    String sound() {
        return "Woof";
    }
    // Если тип возвращаемого значения не совпадает, будет ошибка компиляции.
}
