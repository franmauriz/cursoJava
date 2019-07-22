public class Persona {
    String nombre;

    Persona (String nombre){
        this.nombre = nombre;
    }

    String obtenerpersona(){
        return this.nombre;
    }

    void modificarpersona(String nombre){
        this.nombre = nombre;
    }
}
