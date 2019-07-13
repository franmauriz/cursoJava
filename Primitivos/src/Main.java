public class Main {
    public static void main(String args []){
        // byte, short, int ,long
        System.out.println("bits tipo byte: " + Byte.SIZE);
        System.out.println("bytes tipo byte: " + Byte.BYTES);
        System.out.println("valor minimo tipo bytes: " + Byte.MIN_VALUE);
        System.out.println("valor maximo tipo bytes: " + Byte.MAX_VALUE);
        System.out.println("");
        System.out.println("bits tipo short: " + Short.SIZE);
        System.out.println("bytes tipo short: " + Short.BYTES);
        System.out.println("valor minimo tipo short: " + Short.MIN_VALUE);
        System.out.println("valor maximo tipo short: " + Short.MAX_VALUE);
        System.out.println("");
        System.out.println("bits tipo int: " + Integer.SIZE);
        System.out.println("bytes tipo int: " + Integer.BYTES);
        System.out.println("valor minimo tipo int: " + Integer.MIN_VALUE);
        System.out.println("valor maximo tipo int: " + Integer.MAX_VALUE);
        System.out.println("");
        System.out.println("bits tipo long: " + Long.SIZE);
        System.out.println("bytes tipo long: " + Long.BYTES);
        System.out.println("valor minimo tipo long: " + Long.MIN_VALUE);
        System.out.println("valor maximo tipo long: " + Long.MAX_VALUE);

        // varibales
        System.out.println();
        byte byteVar = 127;
        System.out.println("byteVar = " + byteVar);
        short shortVar = 100;
        System.out.println("shortVar = " + shortVar);
        int intVar = 500;
        System.out.println("intVar = " + intVar);
        long longVar= 1000;
        System.out.println("longVar = " + longVar);

        var numero = 10;
        var numeroDos = 10L;
    }
}
