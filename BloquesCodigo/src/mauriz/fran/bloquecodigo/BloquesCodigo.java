package mauriz.fran.bloquecodigo;

public class BloquesCodigo {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        int idPersona = persona1.getIdPersona();
        System.out.println("idPersona = " + idPersona);
        System.out.println("");
        Persona persona2 = new Persona();
        int idPersona2 = persona2.getIdPersona();
        System.out.println("idPersona = " + idPersona2);
    }
}
