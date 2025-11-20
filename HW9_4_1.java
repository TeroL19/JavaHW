class ExceptionClass extends Exception {

    public ExceptionClass() {
        super();
    }

    public ExceptionClass(String message) {
        super(message);
    }

    public ExceptionClass(String message, Throwable cause) {
        super(message, cause);
    }
}

public class HW9_4_1 {
    public static void main(String[] args) {
        try {
            throw new ExceptionClass();
        }
        catch (ExceptionClass e) {
            System.out.println("Пойман ExceptionClass");
        }
    }
}
