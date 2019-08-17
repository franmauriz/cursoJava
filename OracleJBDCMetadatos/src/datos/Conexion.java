package datos;

import java.beans.Statement;
import java.sql.*;
import java.util.*;

public class Conexion {
    private static String JDBC_DRIVER;
    private static String JDBC_URL;
    private static String JDBC_USER;
    private static String JDBC_PASS;
    private static Driver driver=null;
    private static String JDBC_FILE_NAME="jdbc";

    public static Properties loadProperties(String file){
        Properties pro = new Properties();
        ResourceBundle bundle = ResourceBundle.getBundle(file);
        Enumeration e = bundle.getKeys();
        String key=null;
        while(e.hasMoreElements()){
            key = (String) e.nextElement();
            pro.put(key,bundle.getObject(key));
        }

        JDBC_DRIVER = pro.getProperty("driver");
        JDBC_URL = pro.getProperty("url");
        JDBC_USER = pro.getProperty("user");
        JDBC_PASS = pro.getProperty("pass");

        return pro;
    }

    public static synchronized Connection getConnection() throws SQLException{
        if(driver == null){
            try {
                loadProperties(JDBC_FILE_NAME);
                Class jdbcDriverClass = Class.forName(JDBC_DRIVER);
                driver = (Driver) jdbcDriverClass.getDeclaredConstructor().newInstance();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASS);
    }

    public static void close(PreparedStatement ps){
        try {
            if (ps != null) {
                ps.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void close(ResultSet rs){
        try {
            if (rs != null) {
                rs.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void close(Connection coon){
        try {
            if (coon != null) {
                coon.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
