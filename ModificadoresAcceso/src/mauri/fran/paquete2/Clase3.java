package mauri.fran.paquete2;
import mauri.fran.paquete1.Clase1;

public class Clase3  extends Clase1{

    public Clase3(){

        //constructor protegido, la ser una subclase puede acceder aunque este en otro paquete
        super(1,3);

        //constructor paquete, y al estar fuera del paquete no tiene acceso
        //super(1,2,3);

        // constructor privado, restringido
        //super(1,2,3,4);
    }

    public void pruebaDesdeClase3(){
        Clase1 c1 = new Clase1();
        System.out.println();
        System.out.println("Atributo publico: " + c1.atrPublico + "o heredado: " + atrPublico);
        System.out.println("Atributo protegido (heredado): " + atrProtegido);
        System.out.println("Atributo paquete: No se puede acceder desde un paquete externo" );
        System.out.println("Atributo privado: Acceso denegado");

        System.out.println();

        //constructor publico
        new Clase1();
        // los demas constructores no se pueden probar asi, sino desde el constructor de esta clase ya que
        // esta es una subclase en otro paquete
        System.out.println("metodo publico: " + c1.metodoPublico());
        System.out.println("metodo protegido (heredado): " + metodoProtegido());
        System.out.println("metodo paquete: no se puede acceder  desde un paquete externo");
        System.out.println("metodo privado: Acceso negado");
    }

}
