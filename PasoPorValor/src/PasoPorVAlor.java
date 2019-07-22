public class PasoPorVAlor {
    public static void main(String[] args) {
        int x =10;
        imprimirValor(x);
        modificarValor(x);
        imprimirValor(x);
    }

    public static void imprimirValor(int arg){
        System.out.println("arg = " + arg);
    }

    public static void modificarValor(int arg){
        arg=200;
    }
}
