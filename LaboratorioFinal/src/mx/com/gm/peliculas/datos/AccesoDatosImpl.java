package mx.com.gm.peliculas.datos;

import mx.com.gm.peliculas.domain.Pelicula;

import java.io.File;
import java.util.List;

class AccesoDatosImpl implements AccesoDatos {
    @Override
    public boolean existe(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        if(archivo.exists()) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public List<Pelicula> listar(String nombre) {
        return null;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) {

    }

    @Override
    public String buscar(String nombreArchivo, String buscar) {
        return null;
    }

    @Override
    public void crear(String nombreArchivo) {

    }

    @Override
    public void borrar(String nombreARchivo) {

    }
}
