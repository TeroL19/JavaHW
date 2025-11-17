package m4_2;

public class HW4_2_2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.go();
    }
}

final class Vehicle {
    public void go() {
        System.out.println("Vehicle goes!");
    }
}

class Car extends Vehicle { // Ошибка компиляции
}
