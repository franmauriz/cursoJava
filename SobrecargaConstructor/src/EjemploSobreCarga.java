public class EjemploSobreCarga {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("juan",20,30000);
        System.out.println("empleado1 = " + empleado1);
        
        Persona persona1 = new Persona("carla",30);
        System.out.println();
        System.out.println("persona1 = " + persona1);
        System.out.println();
        Empleado empleado2 = new Empleado("Felipe",40,60000);
        System.out.println("empleado2 = " + empleado2);
    }
}
