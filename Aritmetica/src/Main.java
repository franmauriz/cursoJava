public class Main {
    public static void main(String args []){
        // variables locales
        int operandoA=6;
        int operandoB=2;
        //creamo bjeto Aritmetica con el constructor
        Aritmetica objeto1= new Aritmetica(operandoA,operandoB);

        System.out.println("operandoA = " + operandoA);
        System.out.println("operandoB = " + operandoB);

        System.out.println("Resultado de la suma: " + objeto1.sumar());
        System.out.println("Resultado de la resta: " + objeto1.restar());
        System.out.println("Resultado de la multiplicar: " + objeto1.multiplica());
        System.out.println("Resultado de la division: " + objeto1.dividir());
    }
}
