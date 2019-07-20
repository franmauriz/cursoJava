import java.sql.SQLOutput;

public class PruebaCaja {
    public static void main(String args []){
        //variables locales
        int ancho=3;
        int alto=2;
        int profundo=6;

        //Creamos el objeto caja

        Caja caja = new Caja(ancho,alto,profundo);

        int volumen = caja.volumen();

        System.out.println("El volumen de la caja es :" + volumen);
    }
}
