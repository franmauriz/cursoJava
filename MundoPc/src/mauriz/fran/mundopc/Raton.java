package mauriz.fran.mundopc;

public class Raton extends DispositivoEntrada {
    private int idRaton;
    private static int contadorRaton;
    private double precio;

    public Raton(String tipoEntrada,String marca, double precio){
        super(tipoEntrada,marca);
        this.precio = precio;
        this.idRaton = ++contadorRaton;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return super.toString() + " [Raton{" +
                "idRaton=" + idRaton +
                ", precio=" + precio +
                "}]";
    }
}
