import java.util.Scanner;

public class Min {
    public static void main(String args []){
        double valor;
        char nota;
        var scan = new Scanner(System.in);

        System.out.print("Proporciona una valor entre 0 y 10: ");
        
        valor=Double.parseDouble(scan.nextLine());
        
        if(valor >= 9 && valor < 10){
            nota = 'A';
        }else if(valor >=8 && valor < 9){
            nota = 'B';
        }else if(valor >=7 && valor < 8){
            nota = 'C';
        }else if(valor >=6 && valor < 7){
            nota = 'D';
        }else{
            nota = 'F';
        }

        System.out.println(nota);

    }
}
