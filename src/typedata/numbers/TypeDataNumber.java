package typedata.numbers;

public class TypeDataNumber {
    public static void main(String[] args) {
        // Number
        byte iniByte =  100;
        short iniShort = 1000;
        int iniInt = 1000000;
        long iniLong = 100000000;
        long iniLong2 = 10000000L;

        System.out.println("Number Type Data");
        System.out.println(iniByte);
        System.out.println(iniShort);
        System.out.println(iniInt);
        System.out.println(iniLong);
        System.out.println(iniLong2);
        System.out.println("=============================");


        // Floating Point Number

        float iniFloat = 1.21f; // float
        double iniDouble = 12.2424; // double

        System.out.println("Floating Point Number");
        System.out.println(iniFloat);
        System.out.println(iniDouble);
        System.out.println("=============================");


        // Literal Number
        int decimalInt = 25; // default
        int hexInt = 0xA132B; // untuk hexadesimal (pecahan 16) menambahkan 0x didepannya diikuti dengan pecahan desimalnya
        int binInt = 0b01010101; // untuk binary menambahkan 0b didepannya diikuti dengan pecahan binarynya

        System.out.println("Literal Number");
        System.out.println(decimalInt);
        System.out.println(hexInt);
        System.out.println(binInt);
        System.out.println("=============================");


        // Underscore -> untuk pemisah (opsional)
        long balance = 1000_000_000_000L;
        int sum = 1000_000;

        System.out.println("Implement Underscore");
        System.out.println(balance);
        System.out.println(sum);
        System.out.println("=============================");


        // Type Data Number Conversion
        // Teori: Widening Casting (Otomatis): byte -> short -> int -> long -> float -> double
        // Teori: Narrowing Casting (Manual): double -> float -> long -> int -> char -> short -> byte
        byte iniByte1 = 10;
        short iniShort1 = iniByte1;
        int iniInt1 = iniShort1;
        long iniLong1 = iniInt1;
        float iniFloat1 = iniLong1;
        double iniDouble1 = iniFloat1;

        float iniFloat2 = (float) iniDouble1;
        long iniLong3 = (long) iniFloat2;
        int iniInt2 = (int) iniLong3;
        short iniShort2 = (short) iniInt2;


    }
}