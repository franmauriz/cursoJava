public class Empleado extends Persona {
    private double sueldo;
    private int idEmpleado;
    private static int contadorEmpleado;

    public Empleado(String nombre, int edad, double sueldo){
        super(nombre,edad);
        this.sueldo = sueldo;
        this.idEmpleado = ++contadorEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public String toString() {
        return super.toString() + " Empleado{" +
                "sueldo=" + sueldo +
                ", idEmpleado=" + idEmpleado +
                '}';
    }
}
