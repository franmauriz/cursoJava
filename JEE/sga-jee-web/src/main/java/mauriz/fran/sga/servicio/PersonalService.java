package mauriz.fran.sga.servicio;

import java.util.List;
import javax.ejb.Local;
import mauriz.fran.sga.domain.Persona;

@Local
public interface PersonalService {

    public List<Persona> listarPersonas();

    public Persona encontrarPersonaPorId(Persona persona);

    public Persona encontrarPersonaPorEmail(Persona persona);

    public void registrarPersona(Persona persona);

    public void modificarPersona(Persona persona);

    public void eliminarPersona(Persona persona);
}
