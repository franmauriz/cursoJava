public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona p = crearobjeto();
        imprimirpersona(p);
        modificarpersona(p);
        imprimirpersona(p);

    }

    public static Persona crearobjeto(){
        return new Persona("Juan");
    }

    public static void modificarpersona(Persona arg){
        arg.modificarpersona("Carlos");
    }

    public static void imprimirpersona(Persona p){
        System.out.println(p.obtenerpersona());
    }
}
