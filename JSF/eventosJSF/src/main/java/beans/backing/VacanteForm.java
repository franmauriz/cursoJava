
package beans.backing;

import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIInput;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
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
    
    public void codigoPostalListener(ValueChangeEvent valueChangeEvent){
        FacesContext facesContext =FacesContext.getCurrentInstance();
        UIViewRoot uiViewRoot = facesContext.getViewRoot();
        String nuevoCodigoPostal = (String) valueChangeEvent.getNewValue();
        if("41927".equals(nuevoCodigoPostal)){
            UIInput coloniaInputText = (UIInput) uiViewRoot.findComponent("vacanteForm:colonia");
            String nuevaColonia = "Sevilla";
            coloniaInputText.setValue(nuevaColonia);
            coloniaInputText.setSubmittedValue(nuevaColonia);
            
            UIInput ciudadInputText = (UIInput) uiViewRoot.findComponent("vacanteForm:ciudad");
            String nuevaCiudad = "Mairena del Aljarafe";
            ciudadInputText.setValue(nuevaCiudad);
            ciudadInputText.setSubmittedValue(nuevaCiudad);
            
            facesContext.renderResponse();
        }
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
