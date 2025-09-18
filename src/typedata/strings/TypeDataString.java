package typedata.strings;

public class TypeDataString {
    public static void main(String[] args) {
        // Char
        char d = 'D';
        char a = 'a';
        char n = 'n';

        System.out.println("================================");
        System.out.println(d);
        System.out.println(a);
        System.out.println(n);
        System.out.println("================================");

        // String
        String firstName = "Dandi";
        String lastName = "Irwanto";

        System.out.println("================================");
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println("================================");

        // Merge String
        String firstN = "Dandi";
        String lastN = "Irwanto";
        String fullName = firstN + " " + lastN;

        System.out.println("==============================");
        System.out.println(fullName);
    }
}