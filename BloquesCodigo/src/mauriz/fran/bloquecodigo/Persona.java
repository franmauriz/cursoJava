package mauriz.fran.bloquecodigo;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;

    static {
        contadorPersonas=10;
        System.out.println("Se ejecuta el bloque estatico");
    }

    {
        System.out.println("Se ejecuta el bloque no estatico");
        idPersona=++contadorPersonas;
    }

    Persona(){
        System.out.println("Se ejecta el constructor de la clase");
    }

    public int getIdPersona(){
        return idPersona;
    }
}
