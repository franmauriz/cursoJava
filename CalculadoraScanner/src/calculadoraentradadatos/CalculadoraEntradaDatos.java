package calculadoraentradadatos;
import java.util.Scanner;

import static calculadora.Operaciones.sumar;

public class CalculadoraEntradaDatos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nun1,nun2;
        System.out.println("Introduce un numero entero:");
        nun1 = scan.nextInt();
        System.out.println("Introduce otro numero entero:");
        nun2 = scan.nextInt();
        System.out.println("El resultado de la suma es: " + sumar(nun1,nun2));

    }
}
