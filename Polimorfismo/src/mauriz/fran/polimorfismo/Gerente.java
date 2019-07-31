package mauriz.fran.polimorfismo;

public class Gerente extends Empleado{
    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre,sueldo);
        this.departamento = departamento;
    }

    public String obtenerDetalles(){
        return super.obtenerDetalles() + " , Departamento: " + departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
