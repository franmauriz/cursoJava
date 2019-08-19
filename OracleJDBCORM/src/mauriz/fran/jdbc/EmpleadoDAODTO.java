package mauriz.fran.jdbc;
import java.sql.*;
import mauriz.fran.dto.EmpleadoDTO;
import mauriz.fran.pool.PoolConexionesOracle;
import java.util.List;
import java.util.ArrayList;

public class EmpleadoDAODTO implements EmpleadoDAO {
    private static String insert ="INSERT INTO EMPLEADOS (NOMBRE,DEPTO_ID,EMAIL,PUESTO,FECHA_CREACION,SALARIO) VALUES (?,?,?,?,?,?)";
    private static String update ="UPDATE EMPLEADOS SET NOMBRE=?,DEPTO_ID=?,EMAIL=?,PUESTO=?,FECHA_CREACION=?,SALARIO=? WHERE EMP_ID=?";
    private static String delete ="DELETE FROM EMPLEADOS WHERE EMP_ID=?";
    private static String select ="SELECT EMP_ID,NOMBRE,DEPTO_ID,EMAIL,PUESTO,FECHA_CREACION,SALARIO FROM EMPLEADOS";
    private Connection con;

    public EmpleadoDAODTO(){

    }

    public EmpleadoDAODTO(Connection con){
        this.con = con;
    }

    @Override
    public int insert(EmpleadoDTO empleado) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;
        int rows =0;
        try{
            con = this.con !=null ? this.con :PoolConexionesOracle.getConnection();
            stmt = con.prepareStatement(insert);
            int index = 1;
            stmt.setString(index++,empleado.getNombre());
            stmt.setString(index++,empleado.getDepto_id());
            stmt.setString(index++,empleado.getEmail());
            stmt.setString(index++,empleado.getPuesto());
            stmt.setString(index++,empleado.getFecha_creacion());
            stmt.setFloat(index++,empleado.getSalario());
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados: " + rows);
        }finally{
            stmt.close();
            if(this.con==null){
                con.close();
            }
        }
        return rows;
    }

    @Override
    public int update(EmpleadoDTO empleado) throws SQLException {
        Connection con =null;
        PreparedStatement stmt=null;
        int rows = 0;
        try{
            con = this.con!=null ? this.con : PoolConexionesOracle.getConnection();
            stmt = con.prepareStatement(update);
            int index=1;
            stmt.setString(index++,empleado.getNombre());
            stmt.setString(index++,empleado.getDepto_id());
            stmt.setString(index++,empleado.getEmail());
            stmt.setString(index++,empleado.getPuesto());
            stmt.setString(index++,empleado.getFecha_creacion());
            stmt.setFloat(index++,empleado.getSalario());
            stmt.setInt(index++,empleado.getEmp_id());
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados: " + rows);
        }finally{
            stmt.close();
            if(this.con==null){
                con.close();
            }
        }
        return rows;
    }

    @Override
    public int delete(EmpleadoDTO empleado) throws SQLException {
        Connection con = null;
        PreparedStatement stmt= null;
        int rows = 0;
        try{
            con = this.con != null ? this.con : PoolConexionesOracle.getConnection();
            stmt = con.prepareStatement(delete);
            stmt.setInt(1,empleado.getEmp_id());
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados: " + rows);
        }finally{
            stmt.close();
            if(this.con==null){
                con.close();
            }
        }
        return rows;
    }

    @Override
    public List<EmpleadoDTO> select() throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<EmpleadoDTO> empleados= new ArrayList<EmpleadoDTO>();
        try{
            con = this.con!= null ? this.con : PoolConexionesOracle.getConnection();
            stmt = con.prepareStatement(select);
            rs = stmt.executeQuery();
            while(rs.next()){
                int empID = rs.getInt(1);
                String nombre = rs.getString(2);
                String deptoID = rs.getString(3);
                String email = rs.getString(4);
                String puesto = rs.getString(5);
                String fechaCreacion = rs.getString(6);
                Float salario = rs.getFloat(7);
                EmpleadoDTO empleado = new EmpleadoDTO();
                empleado.setEmp_id(empID);
                empleado.setNombre(nombre);
                empleado.setDepto_id(deptoID);
                empleado.setEmail(email);
                empleado.setPuesto(puesto);
                empleado.setFecha_creacion(fechaCreacion);
                empleado.setSalario(salario);
                empleados.add(empleado);
            }
        }finally{
            rs.close();
            stmt.close();
            if(this.con==null){
                con.close();
            }
        }
        return empleados;
    }
}
