package cs;
import datos.Conexion;
import java.sql.*;
import oracle.jdbc.*;
import oracle.jdbc.oracore.OracleType;

public class TestCursores {
    public static void main(String[] args) {
        OracleCallableStatement oraCallStmt = null;
        OracleResultSet depResulSet = null;
        try{
            Connection con = Conexion.getConnection();
            oraCallStmt = (OracleCallableStatement) con.prepareCall("{? = call ref_cursor_package.get_empleado_ref_cursor(?)}");
            oraCallStmt.registerOutParameter(1, OracleTypes.CURSOR);
            oraCallStmt.setInt(2,0);
            oraCallStmt.execute();

            depResulSet = (OracleResultSet) oraCallStmt.getCursor(1);
            while(depResulSet.next()){
                System.out.println("Nombre: " + depResulSet.getString(1));
                System.out.println("Salario: " + depResulSet.getFloat(2));
                System.out.println();
            }
            oraCallStmt.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
