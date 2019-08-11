package usuarios.jdbc;
import java.sql.*;


public class Conexion {
    private static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String JDBC_URL = "jdbc:mysql://localhost:3306/usuario?useSSL=false&serverTimezone=UTC";
    private static String JDBC_USER = "franmp";
    private static String JDBC_PASSWORD = "frandaniel10";
    private static Driver driver = null;

    public static synchronized Connection getConnection() throws SQLException{
        if(driver==null){
            try{
                Class jdbcDriver = Class.forName(JDBC_DRIVER);
                driver = (Driver) jdbcDriver.getDeclaredConstructor().newInstance();
            }catch(Exception e ){
                System.out.println("Erro al cargar el Driver");
                e.printStackTrace();
            }
        }
        return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
    }

    public static void close(PreparedStatement ps){
        try{
            if(ps!=null){
                ps.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public static void close(ResultSet rs){
        try{
            if(rs!=null){
                rs.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public static void close(Connection conn){
        try{
            if(conn!=null){
                conn.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

}
