package mauriz.fran.pool;
import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
import java.beans.Statement;
import java.util.*;

public class PoolConexionesOracle {
    private static String JDBC_DRIVER;
    private static String JDBC_URL;
    private static String JDBC_USER;
    private static String JDBC_PASS;
    private static Driver driver= null;
    private static String JDBC_FILE_NAME="jdbc";

    public static Properties loadProperties(String file){
        Properties pro = new Properties();
        ResourceBundle bundle = ResourceBundle.getBundle(file);
        Enumeration e = bundle.getKeys();
        String key = null;
        while(e.hasMoreElements()){
            key = (String) e.nextElement();
            pro.put(key, bundle.getObject(key));
        }

        JDBC_DRIVER = pro.getProperty("driver");
        JDBC_URL = pro.getProperty("url");
        JDBC_USER = pro.getProperty("user");
        JDBC_PASS = pro.getProperty("pass");

        return pro;
    }

    public static DataSource getDataSource(){
        loadProperties(JDBC_FILE_NAME);
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(JDBC_DRIVER);
        ds.setUsername(JDBC_USER);
        ds.setPassword(JDBC_PASS);
        ds.setUrl(JDBC_URL);
        ds.setInitialSize(5);
        return ds;
    }

    public static Connection getConnection() throws SQLException{
        return getDataSource().getConnection();
    }
}
