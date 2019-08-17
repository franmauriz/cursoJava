package test;
import datos.Conexion;
import java.sql.*;
import oracle.jdbc.OracleResultSetMetaData;


public class TestMetadatos {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try{
            con = Conexion.getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM EMPLEADOS");

            OracleResultSetMetaData rsOracle = (OracleResultSetMetaData) rs.getMetaData();
            if(rsOracle == null){
                System.out.println("Metadatos no disponibles");
            }else{
                int columnCount = rsOracle.getColumnCount();
                System.out.println("Nº Columnas: " + columnCount);
                for(int i=1; i< columnCount;i++) {
                    System.out.print("Nombre Columna: " + rsOracle.getColumnName(i));
                    System.out.print(" , Tipo Columna: " + rsOracle.getColumnTypeName(i));
                    switch (rsOracle.isNullable(i)) {
                        case OracleResultSetMetaData.columnNoNulls:
                            System.out.print(" , No acepta nulos");
                            break;
                        case OracleResultSetMetaData.columnNullable:
                            System.out.print(", Si acepta nulos");
                            break;
                        case OracleResultSetMetaData.columnNullableUnknown:
                            System.out.print(" , Valor nulo desconocido");
                            break;
                    }
                    System.out.println();
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            Conexion.close(rs);
            Conexion.close(con);
        }
    }
}
