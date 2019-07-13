import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        var titulo="";
        var autor="";


        Scanner scan = new Scanner(System.in);


        System.out.println("Proporciona el titulo:");
        titulo = scan.nextLine();
        System.out.println("Proporciona el autor:");
        autor = scan.nextLine();

        System.out.println("<"+ titulo + ">" + " fue escrito por " + "<" + autor + ">" );
    }

}
