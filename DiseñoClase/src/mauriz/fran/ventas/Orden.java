package mauriz.fran.ventas;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;


    public Orden(){
        this.idOrden = ++contadorOrdenes;
        productos = new Producto[MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto){
        if(contadorProductos < MAX_PRODUCTOS){
            productos[contadorProductos++] = producto;
        }else{
            System.out.println("Has superado el máximo de productos: " + MAX_PRODUCTOS);
        }
    }

    public double calcularTotal(){
        double total = 0;
        for(int i = 0 ; i < contadorProductos;i++){
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("Orden #" + this.idOrden);
        System.out.println("Base Imponible: " + this.calcularTotal() + " €");
        System.out.println();
        System.out.println("Detalle del pedido:");
        for(int i = 0; i < contadorProductos;i++){
            System.out.print(productos[i].getNombre() + " - ");
            System.out.println(productos[i].getPrecio());
        }
    }

}
