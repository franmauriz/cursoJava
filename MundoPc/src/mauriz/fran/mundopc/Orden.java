package mauriz.fran.mundopc;

public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS=10;

    public Orden(){
        this.idOrden = ++contadorOrdenes;
        computadoras = new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora){
        if(contadorComputadoras < MAX_COMPUTADORAS){
            computadoras[contadorComputadoras++] = computadora;
        }else{
            System.out.println("Has alcanzado el maximo de computadoras: " + MAX_COMPUTADORAS);
        }
    }

    public double calcularTotal(){
        double total =0;
        for(int i=0; i < contadorComputadoras ; i++){
            total+=(computadoras[i].getTeclado().getPrecio()) + (computadoras[i].getRaton().getPrecio()) + (computadoras[i].getMonitor().getPrecio());
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("________________________________________");
        System.out.println("Orden: #" + this.idOrden);
        System.out.println("Total: "+ this.calcularTotal() + " €");
        System.out.println("________________________________________");
        System.out.println("Detalle Pedido:");
        for(int i=0; i<contadorComputadoras ;i++){
            System.out.println(computadoras[i].getNombre());
            System.out.println(computadoras[i].getMonitor().getMarca() + "-" + computadoras[i].getMonitor().getPrecio());
            System.out.println(computadoras[i].getRaton().toString());
            System.out.println(computadoras[i].getTeclado().toString());
        }
    }
}
