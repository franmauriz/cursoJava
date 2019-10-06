package beans.helper;

import beans.model.Colonia;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;

@RequestScoped
@Named

public class ColoniaHelper {

    public List<Colonia> getColonias() {
        List<Colonia> colonias = new ArrayList<>();
        int coloniaId = 1;

        Colonia colonia = new Colonia(coloniaId++, "Mairena del Aljarafe", 41927);
        colonias.add(colonia);

        colonia = new Colonia(coloniaId++, "Sevilla", 41010);
        colonias.add(colonia);

        colonia = new Colonia(coloniaId++, "Remedios", 41011);
        colonias.add(colonia);

        return colonias;
    }

    public int getColoniaIdPorNombre(String nombre) {
        List<Colonia> colonias = this.getColonias();
        int coloniaId = 0;

        for (Colonia colonia : colonias) {
            if (colonia.getNombreColonia().equals(nombre)) {
                coloniaId = colonia.getColoniaId();
                break;
            }
        }

        return coloniaId;
    }

    public int getColoniaIdPorCP(int codigoPostal) {
        List<Colonia> colonias = this.getColonias();
        int coloniaId = 0;

        for (Colonia colonia : colonias) {
            if (colonia.getCodigoPostal() == codigoPostal) {
                coloniaId = colonia.getColoniaId();
                break;
            }
        }

        return coloniaId;
    }
    
    public List<SelectItem> getSelectItem(){
        List<SelectItem> selectItems= new ArrayList<>();
        List<Colonia> colonias = this.getColonias();
        
        for(Colonia colonia:colonias){
            SelectItem selectItem = new SelectItem(colonia.getColoniaId(),
                    colonia.getNombreColonia());
            selectItems.add(selectItem);
        }
        
        return selectItems;
    }

}
