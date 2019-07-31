package mauriz.fran.vargs;

public class VArgs {
    public static void main(String[] args) {
        int numero=0;
        System.out.println("Solo se le pasa un parametro");
        imprimirNumeros(numero);
        System.out.println("Se le pasa un numero n de parametro");
        imprimirNumeros(numero,2,3,4,5,6,7,8);
    }

    public static void imprimirNumeros(int n, int... numeros){
        if(numeros.length <= 0) {
            System.out.println("Este número es obligatorio: " + n);
            System.out.println();
        }else {
            System.out.println("Estos son opcionales");
            for (int numero : numeros
            ) {
                System.out.println(numero);
            }
        }
    }
}
