package datos;

public interface AccesoDatos {
    public static int MAX_REGISTROS = 10;
    public abstract void insertart();
    public abstract  void listar();
}
