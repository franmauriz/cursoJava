package mauriz.fran.empleados;
import mauriz.fran.dto.EmpleadoDTO;
import mauriz.fran.jdbc.EmpleadoDAO;
import mauriz.fran.jdbc.EmpleadoDAODTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Empleados {
    public static void main(String[] args) {
        EmpleadoDAO empleadosDAODTO = new EmpleadoDAODTO();
        List<EmpleadoDTO> empleados = new ArrayList<EmpleadoDTO>();
        try{
            empleados = empleadosDAODTO.select();
            for(EmpleadoDTO empleado : empleados){
                System.out.println(empleado);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
