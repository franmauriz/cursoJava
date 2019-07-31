package mauri.fran.paquete1;

public class Clase1 {
    public int atrPublico = 5;
    protected int atrProtegido = 6;
    int atrPaquete = 7;
    private int atrPrivado = 8;

    public Clase1(){

    }

    public Clase1(int i){
        System.out.println("Contructor publico 1");
    }

    protected Clase1(int i, int j){
        System.out.println("constructor protegido 2");
    }

    Clase1(int i,int j, int k){
        System.out.println("constructor de paquete 3");
    }

    private Clase1(int i, int j, int k, int l){
        System.out.println("constructor privado 4");
    }

    public int metodoPublico(){
        return 9;
    }

    protected  int metodoProtegido(){
        return 10;
    }

    int metedoPaquete(){
        return 11;
    }

    private int metodoPrivado(){
        return 12;
    }


}
