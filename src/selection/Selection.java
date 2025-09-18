package selection;

public class Selection {
    static void main(String[] args) {
        // if statement
        var nilai = 70;
        var absen = 90;

        var lulusNilai = nilai >= 75;
        var lulusAbsen = absen >= 75;

        var lulus = lulusNilai && lulusAbsen;

        if (lulus) {
            System.out.println("Anda Lulus");
        } else {
            System.out.println("Anda Mengulang");
        }

        System.out.println("==================================");

        // Else If Statement
        if (nilai >= 80 && absen >= 80) {
            System.out.println("Nilai Anda A");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Nilai Anda B");
        } else if (nilai >= 60 && absen >= 60) {
            System.out.println("Nilai Anda C");
        } else if (nilai >= 50 && absen >= 50) {
            System.out.println("Nilai Anda D");
        } else {
            System.out.println("Nilai Anda E");
        }

        // Switch Statement
        var grade = "A";

        switch (grade) {
            case "A":
                System.out.println("Wow Anda Lulus dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda Lulus");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin anda tidak belajar");
        }
        // Switch Lambda
        System.out.println("====Switch Lambda====");
        var angka = "A";

        switch (angka) {
            case "A" -> System.out.println("Wow Anda Lulus dengan Baik");
            case "B", "C" -> System.out.println("Anda Lulus");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Mungkin anda tidak belajar");
            }
        };

        // Keyword yield
        // Switch tanpa yield
        System.out.println("======Switch tanpa Yield");
        var nums = "A";
        String ucapan;

        switch (nums) {
            case "A" -> ucapan = "Wow Anda Lulus dengan Baik";
            case "B", "C" -> ucapan = "Anda Lulus";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> ucapan = "Mungkin anda tidak belajar";
        };

        System.out.println(ucapan);

        // Switch dengan yield
        System.out.println("======Switch Yield======");
        var num = "A";
        String ucapan1 = switch (num) {
            case "A":
                yield "Wow Anda Lulus Dengan Baik";
            case "B", "C":
                yield "Anda Lulus";
            case "D":
                yield "Anda Tidak Lulus";
            default:
                yield "Mungkin anda tidak belajar";
        };
        System.out.println(ucapan1);
    }
}
