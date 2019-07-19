public class PersonaPrueba {
    public static void main(String args[]){
        //creacion de una clase
        Persona p1 = new Persona();
        Persona p2 = new Persona();

       //llamada del metodo del objeto creado
        System.out.println("Valores por default del objeto Persona;");

        p1.desplegarNombre();

        //modificar valores del objeto
        p1.nombre="Francisco";
        p1.apellidoPaterno="Mauriz";
        p1.apellidoMaterno="Pereira";

        System.out.println("Nuevos Valores del objeto Persona;");

        p1.desplegarNombre();

        System.out.println("--------------------------");
        System.out.println("Valores de P2:");
        p2.desplegarNombre();

    }
}
