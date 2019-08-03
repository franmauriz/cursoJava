package ejemplointerfaces;
import datos.*;
public class EjemploInterfaces {
    public static void main(String[] args) {
       AccesoDatos datos = new ImplementacionMysql();
       ejecutar(datos,"listar");

       datos=new ImplementacionOracle();
       ejecutar(datos,"insertar");
    }

    private static void ejecutar(AccesoDatos datos, String accion){
        if("listar".equals(accion)){
            datos.listar();
        }else if("insertar".equals(accion)){
            datos.insertart();
        }
    }
}
