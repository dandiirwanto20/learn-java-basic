package looping;

public class WhileLoop {
    static void main(String[] args) {
        // While biasa
        var counter = 1;

        while (counter <= 10) {
            System.out.println("Perulangan While Ke-" + counter);
            counter++;
        }

        // break loop
        var count = 1;
        while (true) {
            System.out.println("Perulangan " + count);
            count++;

            if (count > 10) {
                break;
            }
        }

        System.out.println("Perulangan Berhenti");
    }
}
