package m8_2;

public class HW8_2_2 {

    public static void main(String[] args) {

        // String to StringBuilder
        String str = "Hello";
        StringBuilder sbFromString = new StringBuilder(str);
        System.out.println("String to StringBuilder: " + sbFromString);
        
        // String to StringBuffer
        
        StringBuffer bufferFromString = new StringBuffer(str);
        System.out.println("String to StringBuffer: " + bufferFromString);

        // StringBuilder to String
        
        String strFromSB = sbFromString.toString();
        System.out.println("StringBuilder to String: " + strFromSB);

        // StringBuffer to String
        
        String strFromBuffer = bufferFromString.toString();
        System.out.println("StringBuffer to String: " + strFromBuffer);

        
        // StringBuilder to StringBuffer
        // (прямого способа нет - только через String)
        
        StringBuffer bufferFromSB = new StringBuffer(sbFromString.toString());
        System.out.println("StringBuilder to StringBuffer: " + bufferFromSB);

        
        // StringBuffer to StringBuilder
        // (тоже только через String)
        
        StringBuilder sbFromBuffer = new StringBuilder(bufferFromString.toString());
        System.out.println("StringBuffer to StringBuilder: " + sbFromBuffer);
    }
}
