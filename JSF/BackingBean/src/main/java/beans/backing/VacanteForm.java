
package beans.backing;

import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped

public class VacanteForm {
    @Inject
    private Candidato candidadto;
    
    public void setCandidato(Candidato candidato){
        this.candidadto = candidato;
    }
    
    public String enviar(){
        if(this.candidadto.getNombre().equals("juan")){
            return "exito";
        }else{
            return "fallo";
        }
    }
}
