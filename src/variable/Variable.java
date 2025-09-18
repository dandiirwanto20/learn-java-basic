package variable;

public class Variable {
    public static void main(String[] args) {
        String name;
        name = "Dandi Irwanto";

        int age = 25;
        String address = "Indonesia";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        // var declaration, note var declaration harus di assign datanya
        // var nama; -> error
        var nama = "Dandi Irwanto";
        var umur = 25;
        var alamat = "Indonesia";

        System.out.println(nama);
        System.out.println(umur);
        System.out.println(alamat);

        // final declaration, reason final: secara default di java bisa diubah-ubah nilainya jadi kalo mau menggunakan variable yang tidak dapat di ubah menggunakan final
        final String name1 = "Jangan Diubah"; // bisa di sebut const
        var umurSaya = 25;
        var alamatSaya = "Indonesia";

        // name1 = "Mau saya ubah"; error

        System.out.println(name1);
        System.out.println(umurSaya);
        System.out.println(alamatSaya);
    }
}
