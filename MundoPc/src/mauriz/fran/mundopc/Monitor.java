package mauriz.fran.mundopc;

public class Monitor {
    private int idMonitor;
    private String marca;
    private double tamaño;
    private double precio;
    private static int contadorMonitor;

    public Monitor(){
        this.idMonitor = ++contadorMonitor;
    }

    public Monitor(String marca, double tamaño ,double precio){
        this();
        this.marca = marca;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                ", tamaño=" + tamaño +
                ", precio=" + precio +
                '}';
    }
}
