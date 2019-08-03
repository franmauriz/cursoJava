package manejoexcepciones2;
import datos.*;
import excepciones.*;
public class ManejoExcepciones2 {
    public static void main(String[] args) {
        AccesoDatos datos = new ImplementacionMysql("datosmysql");
        datos.simularError(false);
        ejecutar(datos,"listar");
        datos.simularError(false);
        System.out.println("");
        ejecutar(datos,"insertar");

    }

    public static void ejecutar(AccesoDatos datos, String accion){
        if("listar".equals(accion)){
            try{
                datos.listar();
            }catch(LecturaDatosEx le){
                le.printStackTrace();
            }catch(AccesoDatosEx ex){
                ex.printStackTrace();
            }catch(Exception ex){
                ex.printStackTrace();
            }finally {
                System.out.println("Comprobadas excepciones");
            }
        }else if("insertar".equals(accion)){
            try{
                datos.insertar();
            }catch(EscrituraDatosEx ec){
                ec.printStackTrace();
            }catch(AccesoDatosEx ex){
                ex.printStackTrace();
            }catch(Exception ep){
                ep.printStackTrace();
            }finally {
                System.out.println("Comprobadas excepciones");
            }
        }
    }
}
