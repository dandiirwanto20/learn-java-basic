package typedata.array;

public class ArrayInArray {
    static void main(String[] args) {
        String[][] members = {
             {"Dandi", "Irwanto", "Ind"},
             {"Bud", "Miaw"},
             {"Cimi", "Sugeng"},
        };

        String[] member1 = members[0];
        System.out.println(member1[0]);

        System.out.println(members[0][1]); // kurung siku pertama memanggil array barisnya dan kurung kedua adalah data pada baris itu misal [0], [1], [2]
        System.out.println(members[2][0]);

    }
}
