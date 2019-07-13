import java.util.Scanner;

public class Main {
    public static void main(String args []){
        int alto;
        int ancho;
        var scanner = new Scanner(System.in);

        System.out.println("Proporciona el alto:");
        alto = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el ancho:");
        ancho = Integer.parseInt(scanner.nextLine());
        System.out.println("Area: " + (alto*ancho));
        System.out.println("Perimetro: " + ((alto+ancho)*2));


    }
}
