import java.net.URI;
import java.sql.*;

public class PruebaMysql {
    public static void main(String[] args) {
        //Cadena de conexion de mysql, el parametro useSSL es opcional
        String URI = "jdbc:mysql://localhost:3306/lote6?useSSL=false&serverTimezone=UTC";
        //cargamos el driver de mysql
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //creamos el objeto conexion
            Connection cone = (Connection) DriverManager.getConnection(URI,"ptl28sev000","frandaniel10");
            //creamos el objeto statement
            Statement instruccion = cone.createStatement();
            //creamos la query
            String sql = "select COD_SEDE from planta_cuotas_6_1_19 limit 10";
            //Ejecutamos query
            ResultSet result = instruccion.executeQuery(sql);
            while(result.next()){
                System.out.println(result.getString(1));
            }
            result.close();
            instruccion.close();
            cone.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException sqle){
            sqle.printStackTrace();
        }
    }
}
