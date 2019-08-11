package usuarios.test;
import usuarios.jdbc.UsuarioDAO;
import usuarios.jdbc.UsuarioDAOJDBC;
import usuarios.dto.UsuarioDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TestUsuarios {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAOJDBC = new UsuarioDAOJDBC();
        List<UsuarioDTO> usuarios = new ArrayList<UsuarioDTO>();
        //UsuarioDTO usuarioDTO = new UsuarioDTO();
        //usuarioDTO.setUsuario("francisco");
        //usuarioDTO.setPassword("1234567");
        try {
            usuarios = usuarioDAOJDBC.select();
            for(UsuarioDTO usuario: usuarios){
                System.out.println(usuario);
            }
            //usuarioDAOJDBC.delete(usuarioDTO);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
