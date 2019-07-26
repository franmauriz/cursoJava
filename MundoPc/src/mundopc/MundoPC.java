package mundopc;
import mauriz.fran.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor("LG",15,120);
        Teclado teclado1 = new Teclado("teclado","sony",10);
        Raton raton1 = new Raton("raton","Logitech", 23);
        Computadora computadora1 = new Computadora("Lenovo", monitor1,teclado1,raton1);
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.mostrarOrden();
    }
}
