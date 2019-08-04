package entradadatos;

import java.util.Scanner;

public class EntradaDatosScanner {
    public static void main(String[] args) {
        String captura;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca un dato:");
        captura = scan.nextLine();

        while (captura.charAt(0) != '1') {
            System.out.println(captura);
            captura = scan.nextLine();
        }
    }
}
