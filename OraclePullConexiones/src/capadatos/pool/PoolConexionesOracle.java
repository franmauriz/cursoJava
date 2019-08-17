package capadatos.pool;
import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class PoolConexionesOracle {
    public static DataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUsername("C##PROGRAMAS");
        ds.setPassword("frandaniel10");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
        // definimos el tamaño de pool de conexiones
        ds.setInitialSize(5); // 5 conexiones activas
        return ds;
    }

    public static Connection getConnection() throws SQLException{
        return getDataSource().getConnection();
    }
}
