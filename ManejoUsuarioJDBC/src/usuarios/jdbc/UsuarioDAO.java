package usuarios.jdbc;
import usuarios.dto.UsuarioDTO;

import java.sql.SQLException;
import java.util.List;

public interface UsuarioDAO {
    public int insert(UsuarioDTO usuario) throws SQLException;
    public int update(UsuarioDTO usuario)throws SQLException;
    public int delete(UsuarioDTO usuario)throws SQLException;
    public List<UsuarioDTO> select() throws SQLException;
}
