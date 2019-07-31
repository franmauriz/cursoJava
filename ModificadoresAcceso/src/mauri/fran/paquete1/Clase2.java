package mauri.fran.paquete1;

public class Clase2 {
    public Clase2(){
        System.out.println();
        //constructor publico ok
        new Clase1(1);
        //contructor protegido ok
        new Clase1(1,2);
        //construtor paquete ok
        new Clase1(1,2,3);
        //contructor privado fallo
        //new Clase1(1,2,3,4);
        System.out.println("Cinstructor privado: Accesp negado");
    }

    public void pruebaDesdeClase2(){
        Clase1 c1 = new Clase1();
        System.out.println();
        System.out.println("Atributo publico: " + c1.atrPublico);
        System.out.println("Atributo protegido: " + c1.atrProtegido);
        System.out.println("Atributo paquete: " + c1.atrPaquete);
        System.out.println("Atributo privado: Acceso negado");

        System.out.println();
        System.out.println();
        System.out.println("Atributo publico: " + c1.metodoPublico());
        System.out.println("Atributo protegido: " + c1.metodoProtegido());
        System.out.println("Atributo paquete: " + c1.metedoPaquete());
        System.out.println("Atributo privado: Acceso negado");
    }
}
