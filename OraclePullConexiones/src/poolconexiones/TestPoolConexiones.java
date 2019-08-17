package poolconexiones;

import capadatos.pool.PoolConexionesMysql;
import capadatos.pool.PoolConexionesOracle;
import java.sql.*;

public class TestPoolConexiones {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement stmt= null;
        ResultSet rs =null;
        try{
            con = PoolConexionesMysql.getConnection();
            stmt = con.prepareStatement("SELECT * FROM personas");
            rs = stmt.executeQuery();
            System.out.println("Usamos el pool de conexiones de Mysql");
            while(rs.next()){
                System.out.print("Nombre: " + rs.getString(1));
                System.out.println(", Apellido: "+ rs.getString(2));
            }
            con.close();
            System.out.println();

            con = PoolConexionesOracle.getConnection();
            stmt = con.prepareStatement("SELECT * FROM EMPLEADOS");
            rs = stmt.executeQuery();
            System.out.println("Usamos el pool de conexiones de Oracle");
            while(rs.next()){
                System.out.print("Nombre: " + rs.getString(2));
                System.out.println(", Departamento: "+ rs.getString(3));
            }
            con.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
