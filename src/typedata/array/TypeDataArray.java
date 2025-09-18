package typedata.array;

public class TypeDataArray {
    static void main(String[] args) {
        // basic array
        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Dandi";
        arrayString[1] = "Irwanto";
        arrayString[2] = "Indonesia";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        // Array Initializer
        int[] arrayInt = new int[]{
            10, 90,80,67,29
        };

        long[] arrayLong = new long[]{
             10, 90, 80, 67, 29
        };

        // array[index] -> mengambil data di array
        // array[index] = value -> mengubah data di array
        arrayLong[0] = 99;
        // array.length -> mengambil panjang array

        System.out.println(arrayLong[1]);
        System.out.println(arrayLong[0]);
        System.out.println(arrayLong.length);
    }
}
