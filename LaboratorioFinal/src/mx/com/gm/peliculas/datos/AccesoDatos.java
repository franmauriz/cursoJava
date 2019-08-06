package mx.com.gm.peliculas.datos;
import mx.com.gm.peliculas.domain.Pelicula;
import java.util.*;

public interface AccesoDatos {
    public boolean existe(String nombreArchivo);
    public List<Pelicula> listar(String nombre);
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar);
    public String buscar(String nombreArchivo, String buscar);
    public void crear(String nombreArchivo);
    public void borrar(String nombreARchivo);
}
