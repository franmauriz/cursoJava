import java.util.Scanner;

public class Main {
    public static void main(String args []){
        String nombre;
        int id;
        double precio;
        char simbolo;
        boolean envioGratuito;
        var scanner = new Scanner(System.in);

        System.out.println("Proporciona el nombre:");
        nombre = scanner.nextLine();
        System.out.println("Proporciona el id: ");
        id = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el precio:");
        precio = Double.parseDouble(scanner.nextLine());
        System.out.println("Proporciona el simbolo:");
        simbolo = scanner.nextLine().charAt(0);
        System.out.println("Proporciona el envio gratuito");
        envioGratuito = scanner.nextBoolean();

        System.out.println();
        System.out.println("====================================");
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: " + simbolo+precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
        System.out.println("====================================");
    }
}
