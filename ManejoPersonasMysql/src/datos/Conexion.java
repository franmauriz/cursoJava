package datos;
import java.sql.*;

public class Conexion {
    private static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String JDBC_URL = "jdbc:mysql://localhost:3306/dbpersonas?useSSL=false&serverTimezone=UTC";
    private static String JDBC_USER = "franmp";
    private static String JDBC_PASSWORD = "frandaniel10";
    private static Driver driver = null;

    public static synchronized Connection getConnection() throws SQLException {
        if (driver == null) {
            try {
                Class jdbcDriverClass = Class.forName(JDBC_DRIVER);
                driver = (Driver) jdbcDriverClass.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                System.out.println("Fallo al cargar el driver JDBC");
                e.printStackTrace();
            }
        }
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }

    public static void close(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

    }

    public static void close(PreparedStatement pe) {
        try {
            if (pe != null) {
                pe.close();
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    public static void close(Connection cone) {
        try {
            if (cone != null) {
                cone.close();
            }
        } catch (SQLException con) {
            con.printStackTrace();
        }
    }
}
