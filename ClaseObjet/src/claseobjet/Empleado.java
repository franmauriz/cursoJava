package claseobjet;

public class Empleado {

    private String nombre;
    private double sueldo;

    Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(obj instanceof Empleado){
                Empleado empleado=(Empleado)obj;
                if(nombre.equals(empleado.nombre) && Double.valueOf(sueldo).equals(empleado.sueldo)){
                    return true;
                }else{
                    return false;
                }
        }else{
                return false;
        }
    }

    @Override
    public int hashCode(){
        int hash = 7;
        hash = 31 * hash + this.nombre.hashCode();
        hash = 31 * hash + Double.valueOf(sueldo).hashCode();
        return hash;
    }
}
