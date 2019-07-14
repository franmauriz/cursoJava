public class Main {
    public static void main(String args []){
        int a = 3, valorMinimo=0,valorMaxino=10;
        if (a >= valorMinimo && a <= valorMaxino)
            System.out.println("Dentro de Rango");
        else
            System.out.println("Fuera de Rango");

        boolean vacaciones = true;
        boolean diaDescanso = false;

        if(vacaciones || diaDescanso)
            System.out.println("Papa puede ir a ver a su  hijo al futbol");
        else
            System.out.println("Papa trabaja no puede ir al futbol");

        // operador ternario
        
        int numero = 10;
        
        var res = (numero % 2 == 0) ? "Es numero par" : "Es numero impar";

        System.out.println("res = " + res);

        var par = (numero % 2 == 0) ? true : false;

        if(par)
            System.out.println("Es par");
        else
            System.out.println("Es impar");


    }
}
