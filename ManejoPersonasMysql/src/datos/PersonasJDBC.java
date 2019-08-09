package datos;
import domain.Persona;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class PersonasJDBC {
    private static String SQL_INSERT ="insert into personas(nombre,apellido) values (?,?)";
    private static String SQL_UPDATE ="update personas set nombre=?, apellido=? where idPersona=?";
    private static String SQL_DELETE ="DELETE FROM personas WHERE idPersona=?";
    private static String SQL_SELECT ="SELECT nombre,apellido,idpersona FROM personas ORDER BY idPersona";

    public int insert(String nombre,String apellido){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try{
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            int index = 1; // contador de colomnas
            stmt.setString(index++,nombre);
            stmt.setString(index++,apellido);
            System.out.println("Ejecutando la Query: " + SQL_INSERT);
            rows = stmt.executeUpdate(); // número de registros afectados
            System.out.println("Registros afectados: " + rows);
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    public int update(int idPersona,String nombre,String apellido){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            int index = 1;
            stmt.setString(index++,nombre);
            stmt.setString(index++,apellido);
            stmt.setInt(index++,idPersona);
            System.out.println("Ejecutando la consulta: " + SQL_UPDATE);
            rows=stmt.executeUpdate();
            System.out.println("REgistros afectados: " + rows);
        }catch (SQLException sqle){
            sqle.printStackTrace();
        }finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    public int delete(int idPersona){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try{
            int index=1;
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(index,idPersona);
            System.out.println("Ejecutando la query: " + SQL_DELETE);
            rows = stmt.executeUpdate();
            System.out.println("Registros Eliminados:" + rows);
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    public List<Persona> select(){
        Connection conn = null;
        PreparedStatement stmt =null;
        ResultSet rs = null;
        Persona persona =null;
        List<Persona> personas = new ArrayList<Persona>();
        try{
            conn = Conexion.getConnection();
            stmt =conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int idpersona = rs.getInt(3);
                String nombre = rs.getString(1);
                String apellido = rs.getString(2);
                persona = new Persona();
                persona.setIdPersona(idpersona);
                persona.setNombre(nombre);
                persona.setApellido(apellido);
                personas.add(persona);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return personas;
    }
}
