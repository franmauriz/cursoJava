package manejogenericos;

public class ManejoGenericos {
    public static void main(String[] args) {
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica<Integer>(15);

        objetoInt.obtenerTipo();

        ClaseGenerica<String> objetoString = new ClaseGenerica<String>("hola");
        objetoString.obtenerTipo();
    }
}
