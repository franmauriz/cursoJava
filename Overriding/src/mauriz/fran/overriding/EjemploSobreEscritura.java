package mauriz.fran.overriding;

public class EjemploSobreEscritura {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("juan",200000);
        System.out.println(empleado.obtenerDetalles());
        System.out.println();
        Gerente gerente = new Gerente("Oscar",800000,"Finanzas");
        System.out.println(gerente.obtenerDetalles());
    }
}
