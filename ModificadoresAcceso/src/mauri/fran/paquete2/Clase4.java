package mauri.fran.paquete2;
import mauri.fran.paquete1.Clase1;

public class Clase4 {

    public Clase4(){
        //Contructor protegido ,protegido al no ser una subclase
        //super(1,2);

        // Contrutor de paquete, no se puede acceder desde una clase externa
        //super(1,2,3);

        //Contructor privado, acceso negado
        //super(1,2,3,4);
    }

    public void pruebaDesdeClase4(){
        Clase1 c1 = new Clase1();
        System.out.println();
        System.out.println("Atributo publico: " + c1.atrPublico );
        System.out.println("Atributo protegido: No se puede acceder desde un paquete externo al NO ser una subclase");
        System.out.println("Atributo paquete: No se puede acceder desde un paquete externo" );
        System.out.println("Atributo privado: Acceso denegado");

        System.out.println();

        //constructor publico
        new Clase1();
        // los demas constructores no se pueden probar asi, sino desde el constructor de esta clase ya que
        // esta es una subclase en otro paquete
        System.out.println("metodo publico: " + c1.metodoPublico());
        System.out.println("metodo protegido: No se puede acceder desde un paquete externo al NO ser una subclase");
        System.out.println("metodo paquete: no se puede acceder  desde un paquete externo");
        System.out.println("metodo privado: Acceso negado");
    }
}
