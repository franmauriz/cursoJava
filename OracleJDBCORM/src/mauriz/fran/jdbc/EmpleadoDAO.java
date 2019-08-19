package mauriz.fran.jdbc;
import mauriz.fran.dto.EmpleadoDTO;
import java.sql.SQLException;
import java.util.List;

public interface EmpleadoDAO {
    public int insert(EmpleadoDTO empleado) throws SQLException;
    public int update(EmpleadoDTO empleado) throws SQLException;
    public int delete(EmpleadoDTO empleado) throws SQLException;
    public List<EmpleadoDTO> select() throws SQLException;
}
