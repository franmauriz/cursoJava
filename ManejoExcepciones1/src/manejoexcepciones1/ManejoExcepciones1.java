package manejoexcepciones1;
import domain.*;

public class ManejoExcepciones1 {
    public static void main(String[] args) {
        try {
            Division div = new Division(2, 0);
            div.visualizarOperacion();
        }catch(OperationException e){
            System.out.println("error = " + e);
            e.printStackTrace();;
        }
    }
}
