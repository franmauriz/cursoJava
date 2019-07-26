package mauriz.fran.mundopc;

public class Teclado extends DispositivoEntrada {
    private int idTeclado;
    private static int contadorTeclado;
    private double precio;

    public Teclado(String tipoDispositivo, String marca, double precio){
        super(tipoDispositivo,marca);
        this.precio = precio;
        this.idTeclado = ++contadorTeclado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return super.toString() + " [Teclado{" +
                "idTeclado=" + idTeclado +
                ", precio=" + precio +
                "}]";
    }
}
