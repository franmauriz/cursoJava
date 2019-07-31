package mauriz.fran.autounboxing;

public class AutoUnBoxing {
    public static void main(String[] args) {
        Integer enteroObj = 10;
        Float floatObjt = 15.4F;
        Double dobleObj =3.4;
        System.out.println("Autoboxing"); // se convierte de tipos primitivos a obj
        System.out.println("Entero Obj: " + enteroObj.intValue());
        System.out.println("Flotante Obj: " + floatObjt.floatValue());
        System.out.println("Doble Obj: " + dobleObj.doubleValue());

        System.out.println();
        System.out.println("Autounboxing"); // se convierte de tipo Obj a tipo primitivo

        int entero = enteroObj;
        float flotante = floatObjt;
        double doble = dobleObj;

        System.out.println("doble = " + doble);
        System.out.println("flotante = " + flotante);
        System.out.println("entero = " + entero);

    }
}
