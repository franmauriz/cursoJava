import java.util.Scanner;

public class Main {
    public static void main(String args []){
        int numero1;
        int numero2;
        var scanner = new Scanner(System.in);

        System.out.println("Proporciona el numero1:");
        numero1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el numero2:");
        numero2 = Integer.parseInt(scanner.nextLine());
        System.out.println("El numero mayor es:");
        if(numero1 >= numero2)
            System.out.println(numero1);
        else
            System.out.println(numero2);

    }
}
