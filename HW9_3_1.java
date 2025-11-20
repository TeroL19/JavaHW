class Exception1 extends Exception {}
class Exception2 extends Exception1 {}
class Exception3 extends Exception2 {}

public class HW9_3_1 {
    public static void main(String[] args) {

        try {
            int[] arr = new int[3];
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
            Object x = null;
            x.toString(); // NullPointerException
        } 

        catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            // Одинаковая обработка
            System.out.println("Поймано исключение: " + e.getClass().getSimpleName());
        }

        try {
            throw new Exception3(); // Cамая глубокая
        } // Правильный порядок - от самого глубокого к самому базовому
        catch (Exception3 e) {
            System.out.println("Обработан Exception3");
        } 
        catch (Exception2 e) {
            System.out.println("Обработан Exception2");
        } 
        catch (Exception1 e) {
            System.out.println("Обработан Exception1");
        }
    }
}

