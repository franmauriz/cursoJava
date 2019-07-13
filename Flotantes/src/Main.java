public class Main {
    public static void main(String args []){
        // float , double
        System.out.println("Float");
        System.out.println("bits tipo float: " + Float.SIZE);
        System.out.println("bytes tipo float: " + Float.BYTES);
        System.out.println("valor minimo tipo float: " + Float.MIN_VALUE);
        System.out.println("valor maximo tipo float: " + Float.MAX_VALUE);
        System.out.println();
        System.out.println("Double");
        System.out.println("bits tipo Double: " + Double.SIZE);
        System.out.println("bytes tipo Double: " + Double.BYTES);
        System.out.println("valor minimo tipo Double: " + Double.MIN_VALUE);
        System.out.println("valor maximo tipo Double: " + Double.MAX_VALUE);

        float floatVar = 0.5F;

        double doubleVar = 0.10D;

        System.out.println();
        System.out.println("floatVar = " + floatVar);
        System.out.println("doubleVar = " + doubleVar);
    }
}
