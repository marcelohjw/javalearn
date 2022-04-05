import java.math.BigDecimal;

class BasicsDemo{
    static void print() {
        System.out.println("\n\nInside print ...");
        System.out.println("Hello world!");
        System.out.println();
        System.out.println("Hello world!!");
        System.out.println("Hello,");
        System.out.println(" ");
        System.out.println("world!!!");

    }
    
    static void primitives() {
        System.out.println("\n\nInside primitives ...");
        int intHex = 0x0041;
        System.out.println("intHex: " + intHex);

        // Java 7 the binary numbers
        int intBinary = 0b01000_001;
        System.out.println("intBinary: " + intBinary);

        int intOctal = 0101;
        System.out.println("intOctal: " + intOctal);
    }

    public static void main(String[] args) {
        //primitives();
        System.out.println(1 - 0.9);

        BigDecimal _first = new BigDecimal("0.1");
        BigDecimal second = new BigDecimal("0.2");
        System.out.println(_first.add(second));

    }

}