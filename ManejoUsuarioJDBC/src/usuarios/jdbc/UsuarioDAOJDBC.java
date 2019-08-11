package usuarios.jdbc;

import usuarios.dto.UsuarioDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import usuarios.jdbc.Conexion;

public class UsuarioDAOJDBC implements UsuarioDAO {

    private static String insert = "INSERT INTO usuarios(usuario,password) VALUES (?,?)";
    private static String update ="UPDATE usuarios SET usuario=?, password=? WHERE id_usuario=?";
    private static String delete = "DELETE FROM usuarios WHERE id_usuario=?";
    private static String select = "SELECT id_usuario,usuario,password FROM usuarios";
    Connection userConn;

    public UsuarioDAOJDBC(){

    }

    public UsuarioDAOJDBC(Connection conn){
        this.userConn = conn;
    }

    @Override
    public int insert(UsuarioDTO usuario) throws SQLException {
        PreparedStatement stmt= null;
        Connection cone = null;
        int rows=0;
        try{
            cone = this.userConn!=null ? this.userConn : Conexion.getConnection();
            stmt = cone.prepareStatement(insert);
            int index=1;
            stmt.setString(index++,usuario.getUsuario());
            stmt.setString(index++,usuario.getPassword());
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados: " + rows);
        }finally {
            Conexion.close(stmt);
            if(this.userConn==null){
                Conexion.close(cone);
            }
        }
        return rows;
    }

    @Override
    public int update(UsuarioDTO usuario) throws SQLException {
        Connection cone = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try{
            cone = this.userConn != null ? this.userConn : Conexion.getConnection();
            stmt = cone.prepareStatement(update);
            int index = 1;
            stmt.setString(index++,usuario.getUsuario());
            stmt.setString(index++,usuario.getPassword());
            stmt.setInt(index++,usuario.getId_usuario());
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados: " + rows);
        }finally {
            Conexion.close(stmt);
            if(this.userConn==null){
                Conexion.close(cone);
            }
        }
        return rows;
    }

    @Override
    public int delete(UsuarioDTO usuario) throws SQLException {
        Connection cone = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try{
            cone = this.userConn != null ? this.userConn : Conexion.getConnection();
            stmt = cone.prepareStatement(delete);
            stmt.setInt(1,usuario.getId_usuario());
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados: " + rows);
        }finally {
            Conexion.close(stmt);
            if(this.userConn==null){
                Conexion.close(cone);
            }
        }
        return rows;
    }

    @Override
    public List<UsuarioDTO> select() throws SQLException {
        Connection cone = null;
        PreparedStatement stmt = null;
        List<UsuarioDTO> usuariosLista = new ArrayList<UsuarioDTO>();
        ResultSet rs = null;
        try{
            cone = this.userConn != null ? this.userConn : Conexion.getConnection();
            stmt = cone.prepareStatement(select);
            rs = stmt.executeQuery();
            while(rs.next()){
                int idUsuario= rs.getInt(1);
                String usuario = rs.getString(2);
                String password = rs.getString(3);
                UsuarioDTO usuarios = new UsuarioDTO();
                usuarios.setId_usuario(idUsuario);
                usuarios.setUsuario(usuario);
                usuarios.setPassword(password);
                usuariosLista.add(usuarios);
            }
        }finally {
            Conexion.close(stmt);
            if(this.userConn==null){
                Conexion.close(cone);
            }
        }
        return usuariosLista;
    }
}
