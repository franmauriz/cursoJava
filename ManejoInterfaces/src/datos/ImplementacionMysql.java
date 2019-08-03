package datos;

public class ImplementacionMysql implements AccesoDatos {

    @Override
    public void insertart() {
        System.out.println("Insertar desde Mysql");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Mysql");
    }
}
