class Animal {
    public void run() {
        System.out.println("The Animal runs!");
    }
}

class Leopard extends Animal {
    @Override
    public void run() {
        System.out.println("The Leopard runs fast!!!");
    }
}

public class HW1_1_1 {
    public static void main(String[] args) {
        Animal animal = new Animal(); // Класс
        Animal leo = new Leopard(); // Подкласс
        animal.run(); // Запускается "The Animal runs!"
        leo.run(); // Запускается "The Leopard runs fast!!!"
    }
}
