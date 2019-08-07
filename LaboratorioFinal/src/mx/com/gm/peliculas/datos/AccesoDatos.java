package mx.com.gm.peliculas.datos;
import mx.com.gm.peliculas.domain.Pelicula;
import java.util.*;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.EscrituraDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

public interface AccesoDatos {
    public abstract boolean existe(String nombreArchivo);
    public abstract List<Pelicula> listar(String nombre) throws LecturaDatosEx;
    public abstract void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;
    public abstract String buscar(String nombreArchivo, String buscar);
    public abstract void crear(String nombreArchivo);
    public abstract void borrar(String nombreARchivo);
}
