package mx.com.gm.peliculas.negocio;
import mx.com.gm.peliculas.datos.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.EscrituraDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

import java.util.ArrayList;
import java.util.List;

public class CatalogoPeliculasImpl implements CatalogoPeliculas{

    public CatalogoPeliculasImpl(){

    }

    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
        AccesoDatos escribirPelicula = new AccesoDatosImpl();
        Pelicula peli = new Pelicula(nombrePelicula);
        try {
            escribirPelicula.escribir(peli, nombreArchivo, true);
        }catch (EscrituraDatosEx ede){
            ede.printStackTrace();
        }
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
        AccesoDatos lista = new AccesoDatosImpl();
        List<Pelicula> peliculas = new ArrayList<Pelicula>();
        try {
            peliculas=lista.listar(nombreArchivo);
            for(Pelicula pelicula : peliculas){
                System.out.println(pelicula.getNombre());
            }
        }catch (LecturaDatosEx lde){
            lde.printStackTrace();
        }
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
        AccesoDatos busqueda = new AccesoDatosImpl();
        String nombrePelicula;
        nombrePelicula=busqueda.buscar(nombreArchivo,buscar);
        System.out.println("nombrePelicula = " + nombrePelicula);
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        AccesoDatos crear = new AccesoDatosImpl();
        crear.crear(nombreArchivo);
    }
}
