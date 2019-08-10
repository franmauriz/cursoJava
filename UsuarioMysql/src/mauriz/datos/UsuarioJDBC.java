package mauriz.datos;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import mauriz.domain.Usuario;

public class UsuarioJDBC {
    private Connection userConn;
    private static final String SQL_INSERT="insert into usuarios(usuario,password) values (?,?)";
    private static final String SQL_UPDATE="update usuarios set usuario=?, password=? where id_usuario=?";
    private static final String SQL_DELETE="delete from usuarios where id_usuario=?";
    private static final String SQL_SELECT="select id_usuario,usuario,password from usuarios order by id_usuario";

    public UsuarioJDBC(){}

    public UsuarioJDBC(Connection c){
        this.userConn = c;
    }

    public int insert(String usuario,String password){
        PreparedStatement stmt=null;
        int rows=0;
        try{
            if(this.userConn==null){
                this.userConn=Conexion.getConnection();
            }
            stmt= this.userConn.prepareStatement(SQL_INSERT);
            int index = 1;
            stmt.setString(index++,usuario);
            stmt.setString(index++,password);
            System.out.println("Ejecutando la query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados: " + rows);
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            Conexion.close(stmt);
            Conexion.close(this.userConn);
        }
        return rows;
    }

    public int update(int id_usuario,String usuario, String password){
        int rows=0;
        PreparedStatement stmt=null;
        try{
            if(this.userConn==null){
                this.userConn=Conexion.getConnection();
            }
            int index=1;
            stmt= this.userConn.prepareStatement(SQL_UPDATE);
            stmt.setString(index++,usuario);
            stmt.setString(index++,password);
            stmt.setInt(index++,id_usuario);
            System.out.println("Ejecutamos la query: " + SQL_UPDATE);
            rows = stmt.executeUpdate();
            System.out.println("Registros adectados: " + rows);
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexion.close(stmt);
            Conexion.close(this.userConn);
        }
        return rows;
    }

    public int delete(int id_usuario){
        int rows=0;
        PreparedStatement stmt=null;
        try{
            if(this.userConn==null){
                this.userConn=Conexion.getConnection();
            }
            stmt = this.userConn.prepareStatement(SQL_DELETE);
            stmt.setInt(1,id_usuario);
            System.out.println("Ejecutamos la query: " + SQL_DELETE);
            rows = stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            Conexion.close(stmt);
            Conexion.close(this.userConn);

        }
        return rows;
    }

    public List<Usuario> select(){
        List<Usuario> usuarios = new ArrayList<Usuario>();
        PreparedStatement stmt=null;
        ResultSet rs = null;
        Usuario usuario =null;
        try{
            if(this.userConn==null){
                this.userConn=Conexion.getConnection();
            }
            stmt = this.userConn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int id_usuario = rs.getInt(1);
                String usu = rs.getString(2);
                String password = rs.getString(3);
                usuario = new Usuario();
                usuario.setId_usuario(id_usuario);
                usuario.setUsuario(usu);
                usuario.setPassword(password);
                usuarios.add(usuario);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(this.userConn);
        }
        return usuarios;
    }
}
