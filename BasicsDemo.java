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
        System.out.println("\nInside primitives V|V");
        int intHex = 0x0041;
        System.out.println("intHex: " + intHex);

        // Java 7 the binary numbers
        int intBinary = 0b01000_001;
        System.out.println("intBinary: " + intBinary);

        int intOctal = 0101;
        System.out.println("intOctal: " + intOctal);

        // Char uses

        char charInt = 65;
        System.out.println("charInt: " + charInt);

        char charHex = 0x0041;
        System.out.println("charHex: " + charHex);

        char charBinary = 0b01000_001;
        System.out.println("charBinary: " + charBinary);

    }

    static void typeCasting() {
        System.out.println("\nInside typeCasting..");
        // Explicit Casting
        long y = 42;
        //  int x = y;
        int x = (int) y;

        // Information loss due to out-of-range
        byte narrowByte = (byte)123456;
        System.out.println("narrowByte: " + narrowByte);

        // Truncation
        int iTruncated = (int)0.99;
        System.out.println("iTruncated: " + iTruncated);

        // Implicit cast (int to long)
        y = x;

        // Implicit cast (char to int)
        char charA = 'A';
        int iInt = charA; //65
        System.out.println("iInt: " + iInt);

        // Byte to char using an explicit cast
        byte bByte = 65;
        charA = (char)bByte; // Special convetion (widening from byte --> int followed by narrowing from int --> char)
        System.out.println("charA: " + charA);
    }

    static void arrays() {
        System.out.println("Inside arrays..\n");
        /*
        int scores[] = new int[4];
        scores[0] = 90;
        scores[1] = 70;
        scores[2] = 80;
        scores[3] = 100;
        */

        //int scores[] = new int[] {90, 70, 80, 100};

        int scores[] = {90, 70, 80, 100};

        System.out.println("Mid-Term 1: " + scores[0]);
        System.out.println("Mid-Term 2: " + scores[1]);
        System.out.println("Mid-Term Final: " + scores[2]);
        System.out.println("Mid-Term Project: " + scores[3]);
        System.out.println("Exams: " + scores.length);


        /* On windows will work
        Student[] students = new Student[3];
        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();
        System.out.println("Student 1: " + students[0]);
        System.out.println("Student 2: " + students[1]);
        System.out.println("Student 3: " + students[2]);
        */
    }


    public static void main(String[] args) {
        //System.out.println("Primitives: ");
        //primitives();
        //System.out.println("---------------------");
        //System.out.println(1 - 0.9);

        //BigDecimal _first = new BigDecimal("0.1");
        //BigDecimal second = new BigDecimal("0.2");
        //System.out.println(_first.add(second));
        //typeCasting();
        arrays();
    }

}
