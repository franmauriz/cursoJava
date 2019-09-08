
package beans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author franmp
 */
public class listaRectangulos {
    private List<Rectangulo> lista = new ArrayList<>();
    
    public void setRectangulo(Rectangulo r){
        this.lista.add(r);
    }
    
    public List<Rectangulo> getLista(){
        return lista;
    }
    
    public void setLista(List<Rectangulo> lista){
        this.lista = lista;
    }
    
}
