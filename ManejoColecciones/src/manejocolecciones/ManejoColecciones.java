package manejocolecciones;
import java.util.*;
import java.util.ArrayList;


public class ManejoColecciones {
    public static void main(String[] args) {
        List milista = new ArrayList();
        milista.add(1);
        milista.add(2);
        milista.add(3);
        milista.add(3);
        imprimir(milista);

        Set miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        miSet.add("300");
        imprimir(miSet);

        Map miMap = new HashMap();
        miMap.put("1","juam");
        miMap.put("2","carlos");
        miMap.put("3","Rosario");
        miMap.put("4","Esperanza");
        imprimir(miMap.keySet());
        imprimir(miMap.values());
    }

    public static void imprimir(Collection coleccion){
        for(Object elemento: coleccion){
            System.out.print(elemento + " ");
        }
        System.out.println("");
    }
}
