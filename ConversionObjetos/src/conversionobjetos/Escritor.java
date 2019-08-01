package conversionobjetos;

public class Escritor extends Empleado{
    final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre,sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", Tipo Escritura: " + tipoEscritura.getDescripcion();
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }

    public String getTipoDeEscrituraEnTexto(){
        return tipoEscritura.getDescripcion();
    }
}
