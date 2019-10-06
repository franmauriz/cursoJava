
package beans.lifecycle;


import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class DebuggerListener implements javax.faces.event.PhaseListener {
    
    Logger log = LogManager.getRootLogger();
    
    @Override
    public void beforePhase(PhaseEvent arg0) {
        if(log.isInfoEnabled()){
            log.info("Antes de la fase: " + arg0.getPhaseId().toString());
        }
    }

    @Override
    public void afterPhase(PhaseEvent arg0) {
        if(log.isInfoEnabled()){
            log.info("Despues de la fase: " + arg0.getPhaseId().toString());
        }
    }   

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
    
}
