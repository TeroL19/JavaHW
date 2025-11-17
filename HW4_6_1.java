public class HW4_6_1 {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);
        Point p3 = new Point(2, 3);

        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.equals(p3)); // false
        System.out.println(p1.equals(null)); // false
    }
}

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // рефлексивность
        if (obj == null) return false;  // сравнение с null
        if (getClass() != obj.getClass()) return false; // один класс
        Point p = (Point) obj;
        return x == p.x && y == p.y;    // сравнение полей
    }
}