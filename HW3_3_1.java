public class HW3_3_1 {
    public static void main(String[] args) {
        // Через имя класса
        A.printVars();

        // Через объект
        A obj = new A();
        obj.printVars();

        // Через временный объект
        new A().printVars();

        // Через наследника
        B.printVars();
        new B().printVars();
    }
}

class A {
    public static int a = 1;
    public static int b = 2;

    public static void printVars() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

class B extends A {

}
