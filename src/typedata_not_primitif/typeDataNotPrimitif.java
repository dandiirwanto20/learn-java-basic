package typedata_not_primitif;

public class typeDataNotPrimitif {
    public static void main(String[] args) {
        // Tipe Data bukan Primitif: Byte, Short, Integer, Long, Float, Double, Character, Boolean
        Integer iniInteger = 10;
        Long iniLong = 10L;
        Boolean iniBool = true;

        Short iniShort; // null
        iniShort = 100;

        // Konversi Dari Tipe Primitif
        int age = 30;
        Integer ageObject = age;

        int ageAgain = ageObject;

        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();
    }
}
