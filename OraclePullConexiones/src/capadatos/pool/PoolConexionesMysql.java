package capadatos.pool;
import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class PoolConexionesMysql {
    public static DataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUsername("franmp");
        ds.setPassword("frandaniel10");
        ds.setUrl("jdbc:mysql://localhost:3306/dbpersonas?useSSL=false&serverTimezone=UTC");
        // definimos el tamaño de pool de conexiones
        ds.setInitialSize(5); // 5 conexiones activas
        return ds;
    }

    public static Connection getConnection() throws SQLException{
        return getDataSource().getConnection();
    }
}
