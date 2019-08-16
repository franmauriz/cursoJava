package cs;

import datos.Conexion;
import java.sql.*;

public class TestProcedimeinto {
    public static void main(String[] args) {
        int empleadoId = 2;
        double incrementoSalario =1.1;
        Connection con=null;
        try{
            con = Conexion.getConnection();
            Statement stmt = null;
            ResultSet rs = null;
            CallableStatement csmt = null;

            stmt = con.createStatement();

            System.out.println("Aumento del salario de empleado : " + empleadoId);
            csmt = con.prepareCall("{ call set_employee_salary(?,?) }");
            csmt.setInt(1,empleadoId);
            csmt.setDouble(2,incrementoSalario);
            csmt.execute();
            csmt.close();

            String query = "select nombre, salario from empleados where emp_id = " + empleadoId;

            rs = stmt.executeQuery(query);
            rs.next();
            System.out.println("Nombre: " + rs.getString(1));
            System.out.println("Salario: "+ rs.getFloat(2));


        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
