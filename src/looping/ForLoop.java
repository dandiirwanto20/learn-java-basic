package looping;

public class ForLoop {
    static void main(String[] args) {
        // Code perulangan tanpa henti
        // for(;;) {
        //    System.out.println("Perulangan Tanpa Henti");
        // }

        // Code Perulangan Dengan Kondisi
        var counter = 1;
        for (; counter <= 10; ) {
            System.out.println("Perulangan Counter Ke-" + counter);
            counter++;
        }

        // Perulangan dengan Init statement
        for (var count = 1; count <= 10; ) {
            System.out.println("Perulangan Count Ke-" + count);
            count++;
        }

        // Perulangan Dengan Post Statement
        for (var hitung = 1; hitung <= 10; hitung++) {
            System.out.println("Perulangan Hitung Ke-" + hitung);
        }

        for (var hitung2 = 1; hitung2 <= 100; hitung2++) {
            if (hitung2 % 2 == 0) {
                continue; // ketika mendapatkan angka genap maka akan di skip dan di lanjutkan dengan looping selanjutnya
            }
            System.out.println("Perulangan Ganjil Ke-" + hitung2);
        }
    }
}
