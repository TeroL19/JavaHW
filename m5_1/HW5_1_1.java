package m5_1;

class Outer {

    public class PublicInner {}
    protected class ProtectedInner {}
    class DefaultInner {}
    private class PrivateInner {}

    void demo() {
        new PublicInner();
        new ProtectedInner();
        new DefaultInner();
        new PrivateInner(); // доступен внутри Outer
    }
}

public class HW5_1_1 {
    public static void main(String[] args) {
        Outer o = new Outer();

        // Доступны:
        Outer.PublicInner a = o.new PublicInner();  // public — доступен везде

        // Остальные НЕ видны в другом классе:
        // Outer.ProtectedInner b = o.new ProtectedInner();   // ошибка
        // Outer.DefaultInner c = o.new DefaultInner();       // ошибка
        // Outer.PrivateInner d = o.new PrivateInner();       // ошибка
    }
}
