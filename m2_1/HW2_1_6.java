public class HW2_1_6 {
    public static void main(String[] args) {
        int i = 130;
        byte b = (byte) i;   //Сужающее

        double d = 123.456;
        int j = (int) d;     //Потеря дробной части

        System.out.println("b = " + b);
        System.out.println("j = " + j);
    }
}
