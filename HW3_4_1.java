public class HW3_4_1 {
    public static void main(String[] args) {
        A1 o1 = new A1();
        System.out.println(o1.a);

        A2 o2 = new A2();
        System.out.println(o2.a);

        A3 o3 = new A3(123);
        System.out.println(o3.a);
    }
}


// 1. При объявлении
class A1 {
    public final int a = 10;
}


// 2. В конструкторе 
class A2 {
    public final int a;

    public A2() {
        a = 20;
    }
}


// 3. В блоке инициализации
class A3 {
    public final int a;
    {
        a = 0;
    }

    public A3(int value) {
        // a уже объявлено
    }
}
