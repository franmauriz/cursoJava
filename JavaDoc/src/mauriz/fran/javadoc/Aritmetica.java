package mauriz.fran.javadoc;
/**
 * Esta Clase servira para hacer una suma de dos numeros enteros
 *
 * @author  Fran Mauriz
 * @version 1
 */
public class Aritmetica {
    /**
     * La variable operandoUno recibiera un número entero
     */
    int operandoUno;
    /**
     * La variable operandoDos recibiera un número entero
     */
    int operandoDos;

    public Aritmetica(int operandoUno, int operandoDos) {
        this.operandoUno = 1;
        this.operandoDos = 4;
    }

    /**
     * Este metodo sumara el valor de las variables que se le pase de tipo entero.
     *
     * @param operandoUno se pasa el primer numero a sumar
     * @param operandoDos se pasa el segundo numero a sumar
     * @return resultado int
     */
    public static int sumar(int operandoUno, int operandoDos){
        int resultado = operandoUno + operandoDos;
        return resultado;
    }
}
