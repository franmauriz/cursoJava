package mauriz.fran.polimorfismo;

public class EjemploPolimorfismo {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("juan", 30000);
        System.out.println();
        imprimirDetalles(empleado);
        System.out.println("_________________________________________");
        System.out.println();
        Gerente gerente= new Gerente("oscar", 80000, "Facturacion");
        imprimirDetalles(gerente);
    }

    public static void imprimirDetalles(Empleado emp){
        System.out.println(emp.obtenerDetalles());
    }
}
