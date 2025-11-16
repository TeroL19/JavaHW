public class HW3_2_1 {
    // Перегрузка
    static class Printer {
        void sayHello() {
            System.out.println("Привет!");
        }

        void sayHello(String name) {
            System.out.println("Привет, " + name + "!");
        }

        void sayHello(String name, int age) {
            System.out.println("Привет, " + name + ". Тебе " + age + " лет.");
        }
    }

    // Наследование
    static class Animal {
        void speak() { // можно переопределить
            System.out.println("Животное издает звук");
        }
    }

    static class Dog extends Animal {
        @Override
        void speak() { // переопределение
            System.out.println("Собака лает: Гав!");
        }
    }

    public static void main(String[] args) {
        Printer obj = new Printer();

        // Перегрузка
        obj.sayHello();
        obj.sayHello("Денис");
        obj.sayHello("Петя", 12);

        // Переопределение
        Animal a = new Animal();
        Animal d = new Dog();  // полиморфизм — ссылка Animal, объект Dog

        a.speak();  // Animal.speak()
        d.speak();  // Dog.speak()
    }
}
