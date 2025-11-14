public class HW2_4_1 {
    public static void main(String[] args) {
        Integer a = Integer.decode("12");     // 12 (десятичное)
        Integer b = Integer.decode("012");    // 10 (восьмеричное)
        Integer c = Integer.decode("0x12");   // 18 (шестнадцатеричное)
        Integer d = Integer.decode("#12");    // 18 (шестнадцатеричное)

        System.out.println(a + ", " + b + ", " + c + ", " + d);
    }
}
