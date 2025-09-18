package arithmetic;

public class arithmetic {
    static void main(String[] args) {
        int a = 100;
        int b = 10;

        // Operasi Matematika
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println("=======================");

        // Augmented Assignments
        int c = 100;

        c += 10;
        System.out.println(c);

        c -= 10;
        System.out.println(c);

        c *= 10;
        System.out.println(c);

        System.out.println("=======================");

        // Unary Operator
        int d = +100;
        int e = -10;

        d++;
        System.out.println(d);

        d--;
        System.out.println(d);

        System.out.println(!true);

        System.out.println("=======================");

        // Operasi Perbandingan
        int value1 = 100;
        int value2 = 100;

        System.out.println(value1 > value2);
        System.out.println(value1 < value2);
        System.out.println(value1 >= value2);
        System.out.println(value1 <= value2);
        System.out.println(value1 == value2);
        System.out.println(value1 != value2);

        System.out.println("=======================");
        // Operasi Boolean
        var absen = 70;
        var nilaiAkhir = 80;

        var lulusAbsen = absen >= 75;
        var lulusNilaiAkhir = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);
    }
}
