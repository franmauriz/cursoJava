
package beans.backing;

import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
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
    
    public VacanteForm(){
        log.info("Creando el objeto VacanteForm");
    }
    
    public void setCandidato(Candidato candidato){
        this.candidadto = candidato;
    }
    
    public String enviar(){
        if(this.candidadto.getNombre().equals("juan")){
            if(this.candidadto.getApellido().equals("perez")){
                String msg = "Gracias, pero " + this.candidadto.getNombre() + " " + this.candidadto.getApellido() + " ya trabaja con nosotros";
                FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR,msg,msg);
                FacesContext facesContext = FacesContext.getCurrentInstance();
                String componentId = null;
                facesContext.addMessage(componentId, facesMessage);
                return "index";
            }
            log.info("Entrando en el caso de exito.");
            return "exito";
        }else{
            log.info("Entrando en el caso de fallo.");
            return "fallo";
        }
    }
}
