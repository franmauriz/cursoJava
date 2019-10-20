package mauriz.fran.sga.cliente;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.*;
import mauriz.fran.sga.domain.Persona;
import mauriz.fran.sga.servicio.PersonaServiceRemote;

public class ClientePersonaService {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente");
        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee/PersonaServiceImpl!mauriz.fran.sga.servicio.PersonaServiceRemote");
            
            List<Persona> personas = personaService.listarPersonas();
            
            for(Persona persona : personas){
                System.out.println(persona);
            }
            
            System.out.println("Fin de la llamada al EJB desde el cliente");
            
        } catch (NamingException ex) {
            Logger.getLogger(ClientePersonaService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
