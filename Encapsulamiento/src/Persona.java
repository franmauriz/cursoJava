public class Persona {
    private String nombre;
    private String apellido;
    private boolean borrado;

    public Persona(){

    }

    public Persona(String nombre,String apellido,boolean borrado){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setBorrado(borrado);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }

    public String toString(){
        return "Nombre " + this.nombre + " apellido: " + this.apellido + " borrado: " + this.borrado;
    }
}
