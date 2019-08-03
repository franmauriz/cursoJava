package datos;
import excepciones.*;

public class ImplementacionMysql implements AccesoDatos {
    private String tipoDatos;
    private boolean simularError;

    public ImplementacionMysql(String tipoDatos){
        this.tipoDatos = tipoDatos;
    }

    @Override
    public void insertar() throws AccesoDatosEx {
        if(simularError){
            throw new EscrituraDatosEx("Error escritura de datos");
        }else{
            System.out.println("Insertar desde Mysql");
        }

    }

    @Override
    public void listar() throws AccesoDatosEx {
        if(simularError){
            throw new LecturaDatosEx("Error lectura de datos");
        }else {
            System.out.println("Listar desde Mysql");
        }
    }

    public boolean isSimularError(){
        return simularError;
    }

    public void simularError(boolean simularError){
        this.simularError = simularError;
    }
}
