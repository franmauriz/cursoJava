package ventas;
import mauriz.fran.ventas.*;

public class Ventas {
    public static void main(String[] args) {
        Producto camisa = new Producto("Camisa", 30);
        Producto pantalon = new Producto("pantalon",40);
        Producto calcetin = new Producto("calcetin",10);
        Producto gafas = new Producto("gafas",140);

        Orden pedido = new Orden();
        pedido.agregarProducto(camisa);
        pedido.agregarProducto(pantalon);

        pedido.mostrarOrden();

        System.out.println("-------------------------");

        Orden pedido2 = new Orden();
        pedido2.agregarProducto(calcetin);
        pedido2.agregarProducto(gafas);

        pedido2.mostrarOrden();




    }
}
