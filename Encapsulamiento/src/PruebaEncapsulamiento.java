public class PruebaEncapsulamiento {
    public static void main(String[] args) {
        Persona ana = new Persona("Ana","Lopez",true);

        System.out.println("Me llamo: " + ana.getNombre() + " " + ana.getApellido() );
        ana.setNombre("Elena");
        ana.setBorrado(false);
        System.out.println("Me llamo: " + ana.getNombre() + " " + ana.getApellido() );
        System.out.println(ana);
    }
}
