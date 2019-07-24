import java.util.Date;

public class EjemploHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("juan",30000);
        empleado1.setGenero('M');
        empleado1.setDireccion("Calle Falsa nº1");
        empleado1.setEdad(20);
        System.out.println("empleado1 = " + empleado1);
        
        Cliente cliente1 = new Cliente(new Date(),false);
        cliente1.setNombre("Rocio");
        cliente1.setGenero('F');
        cliente1.setDireccion("calle fasa nº2");
        cliente1.setEdad(40);
        System.out.println();
        System.out.println("cliente1 = " + cliente1);
    }
}
