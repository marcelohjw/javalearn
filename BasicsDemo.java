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

    static void threeDimensionalArrays() {
        System.out.println("\nInside 3D Arrays.. \n");
        int[][][] unitsSold = new int[][][] {
            { // New York
                {0, 0, 0, 0}, // Jan
                {0, 0, 0, 0}, // Feb
                {0, 0, 0, 0}, // Mar
                {0, 850, 0, 0}, // Apr
            },
            { // San Francisco
                {0, 0, 0, 0}, // Jan
                {0, 0, 0, 0}, // Feb
                {0, 0, 0, 0}, // Mar
                {0, 0, 0, 0}, // Apr
            },
            { // 
                {0, 0, 0, 0}, // Jan
                {0, 0, 0, 0}, // Feb
                {0, 0, 0, 0}, // Mar
                {0, 0, 0, 0}, // Apr
            },
            { // 
                {0, 0, 0, 0}, // Jan
                {0, 0, 0, 0}, // Feb
                {0, 0, 0, 0}, // Mar
                {0, 0, 0, 0}, // Apr
            },
        };

        System.out.println("unitsSold[0][3][1]: " + unitsSold[0][3][1]);
    }

    static void preAndPost() {
        System.out.println("\nInside preAndPost ...");

        int x = 5;

        //x++;

        //System.out.println("x: " + x);

        //int y = x++;

        //System.out.println("y: " + y + ", x: " + x);


        int index = 0;
        int[] array = new int[3];
        array[index] = 10;
        System.out.println(array[index]);
        index++;

        array[index] = 20;
        System.out.println(array[index]);
        index++;

        array[index] = 30;
        System.out.println(array[index]);   

    }

    static boolean isEvenOdd(int x) {
        if(x%2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static void compoundAritmeticAssignment() {
        int x = 100;

        System.out.println("x+= 5: " + (x+=5));
        System.out.println("x-= 5: " + (x-=5));
        System.out.println("x*= 5: " + (x*=5));
        System.out.println("x/= 5: " + (x/=5));
        System.out.println("Is " + x + " even?: " + isEvenOdd(x));
        System.out.println("x%= 5: " + (x%=5));
    }

    static double sum(double x, double y) {
        return x + y;
    }


    static double avg(double x, double y) {
        double sumy = sum(x, y);
        return sumy/2;
    }

    static void go(int[] array) {
        System.out.println("array[0] = " + array[0]);
        System.out.println("array[1] = " + array[1]);
        array[1] = 22;

    }

    static void charTypePromotion() {
        System.out.println("\nInside charTypePromotion...");
        char char1 = 50; // Will be assigned UTF16 value 2
        System.out.println("char1: " + char1);
        System.out.println("(73 - char1): " + (73 - char1)); // char1 gets promoted to int, i.e decimal equivalent 50 in UTF16 is used
        System.out.println("(char1 - '3'): " + (char1 - '3')); //char1 and '3' are promoted to ints
        System.out.println("('a' + 'b'): " + ('a' + 'b')); // 'a' and 'b' are promoted to ints and the respective equivalents 97 and 98 are add
    }

    public static void main(String[] args) {

        charTypePromotion();   
    }

}
