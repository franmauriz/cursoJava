package claseobjet;

public class EjemploObjet {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("juan",2000);
        Empleado empleado2 = new Empleado("juan", 2000);

        compararObjetos(empleado1,empleado2);
    }

    public static void compararObjetos(Empleado obj1, Empleado obj2){
        System.out.println("contenido objeto: " + obj1);
        System.out.println();

        if(obj1 == obj2){
            System.out.println("Los objetos tienen la misma referancia de memoria");
        }else{
            System.out.println("Los objetos NO tienen la misma referancia de memoria");
        }

        if(obj1.equals(obj2)){
            System.out.println("Los objetos  tienen el mismo contenido,son iguales");
        }else{
            System.out.println("Los objetos  NO tienen el mismo contenido, NO son iguales");
        }

        if(obj1.hashCode() == obj2.hashCode()){
            System.out.println("Los objetos tienen el mismo hash code");
        }else{
            System.out.println("Los objetos tienen NO el mismo hash code");
        }


    }
}
