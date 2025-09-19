package looping;

public class DoWhileLoop {
    static void main(String[] args) {
        var counter = 1;

        do {
            System.out.println("Perulangan DoWhile Ke-" + counter);
            counter++;
        } while (counter <= 10); // jika kondisi tidak valid maka dia akan menampilkan output 1 kali, berbeda dengan while yang tidak menampilkan apapun ketika kondisi salah
    }
}
