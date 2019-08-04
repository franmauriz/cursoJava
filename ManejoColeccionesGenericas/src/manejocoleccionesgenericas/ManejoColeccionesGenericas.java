package manejocoleccionesgenericas;

import java.util.*;

public class ManejoColeccionesGenericas {
    public static void main(String[] args) {
        List<String> milista = new ArrayList<>();

        milista.add("1");
        milista.add("2");
        milista.add("3");
        milista.add("4");
        milista.add("4");
        imprimir(milista);

        Set<String> miSet = new HashSet<>();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        miSet.add("300");
        imprimir(miSet);

        Map<String,String> miMap = new HashMap<>();
        miMap.put("1","Juan");
        miMap.put("2","Carlos");
        miMap.put("3","Rosario");
        miMap.put("4","Esperanza");
        imprimir(miMap.keySet());
        imprimir(miMap.values());
    }

    public static void imprimir(Collection<String> coleccion){

        for(String elemento:coleccion){
            System.out.print(elemento + " ");
        }
        System.out.println("");
    }
}
