package manejoexcepciones1;
import domain.*;

public class ManejoExcepcionesArg {
    public static void main(String[] args) throws OperationException {
        try {
            int op1 = Integer.parseInt(args[0]);
            int op2 = Integer.parseInt(args[1]);
            Division div = new Division(op1,op2);
            div.visualizarOperacion();
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Ocurrio un error");
            aie.printStackTrace();
        }catch(NumberFormatException nfe){
            System.out.println("Uno de los operandos no es entero");
            nfe.printStackTrace();
        }catch (OperationException oe){
            System.out.println("Se trato de realizar una operacion erronea");
            oe.printStackTrace();
        }finally {
            System.out.println("Se termino de revisar las excepciones");
        }
    }
}
