package looping;

public class ForEach {
    static void main(String[] args) {
        // Code tanpa For Each
        String[] arrayName = {
            "Dan","Test","D","A",
            "N","DI","IR","W",
        };

        // for (int i = 0; i < arrayName.length; i++) {
        //    System.out.println(arrayName[i]);
        // }

        // Code dengan For Each
        for (var value : arrayName) {
            System.out.println(value);
        }
    }
}
