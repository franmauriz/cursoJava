import java.util.Scanner;

public class Main {
    public static void main(String args []){

        int edad = Integer.parseInt("20");
        System.out.println("edad = " + edad);
        
        double precio = Double.parseDouble("23.87");
        System.out.println("precio = " + precio);
        
        char c = "hola".charAt(0);
        System.out.println("c = " + c);

        var scanner = new Scanner(System.in);

        int numero = Integer.parseInt(scanner.nextLine());
        System.out.println("numero = " + numero);
        
        String edadTexto = String.valueOf(25);
        System.out.println("edadTexto = " + edadTexto);
        
        String valorPi = "" + 3.14D;
        System.out.println("valorPi = " + valorPi);

        byte b = 10;
        short e = b;

        short s1 = 15;
        byte s2 = (byte) s1; //casting
    }
}
