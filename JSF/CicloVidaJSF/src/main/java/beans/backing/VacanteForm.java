
package beans.backing;

import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Named
@RequestScoped

public class VacanteForm {
    @Inject
    private Candidato candidadto;
    Logger log = LogManager.getRootLogger();
    
    public void setCandidato(Candidato candidato){
        this.candidadto = candidato;
    }
    
    public String enviar(){
        if(this.candidadto.getNombre().equals("juan")){
            log.info("Entrando en el caso de exito.");
            return "exito";
        }else{
            log.info("Entrando en el caso de fallo.");
            return "fallo";
        }
    }
}
