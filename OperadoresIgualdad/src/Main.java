public class Main {
    public static void main(String args []){
        int a = 4, b=2;
        boolean c = (a == b);

        c = (a!=b);

        System.out.println("c = " + c);
        
        String d = "" +
                "Hola", e = "hola";
        
        boolean f = d.equals(e); // comparar cadenas

        System.out.println("f = " + f);

        System.out.println("f = " + f);
        
        
        boolean g = a>b; // >=, <=, == ,!=
        System.out.println("g = " + g);

        if(a % 2 == 0)
            System.out.println("Es par");
        else
            System.out.println("No es par");

        int edad=24;
        int adulto=18;
        if(edad >= adulto)
            System.out.println("es un adulto");
        else
            System.out.println("es menor de edad");

    }
}
