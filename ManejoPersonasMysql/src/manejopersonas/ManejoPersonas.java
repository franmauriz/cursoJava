package manejopersonas;
import datos.PersonasJDBC;
import domain.Persona;
import java.util.List;

public class ManejoPersonas {
    public static void main(String[] args) {

        PersonasJDBC perso = new PersonasJDBC();
        //perso.insert("juan","gomez");
        //perso.insert("felipe","gonzalez");
        //perso.update(1,"Juanito","gomez");

        List<Persona> personas=perso.select();

        for(Persona persona: personas) {
            System.out.println(persona.getNombre());
        }
    }
}
