public class Main {
    public static void main(String args[]){
        System.out.println("true tipo boolean: " + Boolean.TRUE);
        System.out.println("false tipo boolean: " + Boolean.FALSE);

        boolean booleanVar = false;

        if(booleanVar)
            System.out.println("El valor de la variable es verdadero");
        else
            System.out.println("El valor de la variable es false");


        var edad = 14;
        var adulto = edad >=18;

        if(adulto)
            System.out.println("Eres adulto, puedes pasar");
        else
            System.out.println("Eres menor, no puedes pasar");


    }
}
