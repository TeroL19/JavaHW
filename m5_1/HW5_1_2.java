package m5_1;

class Outer {
    private int x = 10;
    protected int y = 20;

    public class Inner {
        void print() {
            System.out.println(x); // доступ к private
            System.out.println(y); // доступ к protected
        }
    }
}

public class HW5_1_2 {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner in = o.new Inner();
        in.print();
    }
}

