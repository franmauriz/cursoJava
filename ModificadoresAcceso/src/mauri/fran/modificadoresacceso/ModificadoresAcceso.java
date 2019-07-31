package mauri.fran.modificadoresacceso;


import mauri.fran.paquete1.Clase2;
import mauri.fran.paquete2.Clase3;
import mauri.fran.paquete2.Clase4;


public class ModificadoresAcceso {
    public static void main(String[] args) {

        System.out.println("Acceso desde la clase 2 a clase 1 (mismo paquete)");
        Clase2 c2 = new Clase2();
        c2.pruebaDesdeClase2();
        System.out.println();
        System.out.println("Acceso desde la clase 3 a clase 1 (diferente paquete, pero subclase de  Clase1)");
        Clase3 c3 = new Clase3();
        c3.pruebaDesdeClase3();
        System.out.println();
        System.out.println("Acceso desde la clase 4 a clase 1 (diferente paquete, pero NO es subclase de  Clase1)");
        Clase4 c4 = new Clase4();
        c4.pruebaDesdeClase4();
    }
}
