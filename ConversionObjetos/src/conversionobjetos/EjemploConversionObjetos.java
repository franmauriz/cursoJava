package conversionobjetos;

public class EjemploConversionObjetos {


    public static void main(String[] args) {
        Empleado empleado;

        empleado = new Escritor("Felipe",20000,TipoEscritura.CLASICO);

        imprimirDetalles(empleado);

        empleado = new Gerente("Juan",30000,"Soporte");
        System.out.println();
        imprimirDetalles(empleado);
    }

    public static void imprimirDetalles(Empleado empleado){

        String resultado = null;

        System.out.println("Detalle: " + empleado.obtenerDetalles());

        if(empleado instanceof Escritor){
            Escritor escritor = (Escritor) empleado;
            resultado= escritor.getTipoDeEscrituraEnTexto();

            resultado =((Escritor)empleado).tipoEscritura.getDescripcion();

            System.out.println("Resultado tipoescritura: " + resultado);

        }else if(empleado instanceof Gerente){

            resultado = ((Gerente)empleado).getDepartamento();

            System.out.println("Resultado departamenteo: " + resultado);
        }
    }
}
