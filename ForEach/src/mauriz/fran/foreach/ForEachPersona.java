package mauriz.fran.foreach;

public class ForEachPersona {
    public static void main(String[] args) {
        Persona p1 []={new Persona("Juan"),new Persona("Jorge"),new Persona("cesar")};

        for (Persona persona: p1
             ) {
            System.out.println("persona.getNombre() = " + persona.getNombre());
        }
    }
}
