package cs.testfunciones;
import datos.Conexion;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class TestFunciones {
    public static void main(String[] args) {
        int empleadoId =1;
        try{
            Connection con = Conexion.getConnection();
            CallableStatement cstmt = null;
            double salario;
            cstmt = con.prepareCall("{ ? = call get_employee_salary(?) }");
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setInt(2,empleadoId);
            cstmt.execute();
            salario = cstmt.getDouble(1);
            cstmt.close();
            System.out.println("Empleado con id: " + empleadoId);
            System.out.println("Salario: " + salario);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
