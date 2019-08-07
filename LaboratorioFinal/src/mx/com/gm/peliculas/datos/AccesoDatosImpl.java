package mx.com.gm.peliculas.datos;

import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.EscrituraDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccesoDatosImpl implements AccesoDatos {

    public AccesoDatosImpl(){

    }

    @Override
    public boolean existe(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        if(archivo.exists()) {
            return true;
        }
        return false;
    }

    @Override
    public List<Pelicula> listar(String nombre) throws LecturaDatosEx {
        File archivo = new File(nombre);
        try{
            if(nombre.equals("")){
                throw new LecturaDatosEx("No se puede listar las peliculas,compruebe el nombre del fichero");
            }
            BufferedReader salida = new BufferedReader(new FileReader(archivo));
            List<Pelicula> peliculas = new ArrayList<Pelicula>();
            String linea;
            linea = salida.readLine();
            while(linea != null){
                peliculas.add(new Pelicula(linea));
                linea = salida.readLine();
            }
            salida.close();
            return peliculas;
        }catch(IOException ioe) {
            ioe.printStackTrace();
            return null;
        }
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
        File archivo = new File(nombreArchivo);
        try{
            if(nombreArchivo.equals("")){
                throw new EscrituraDatosEx("El nombre del fichero es incorrecto");
            }
            if(anexar){
                PrintWriter entrada = new PrintWriter(new FileWriter(archivo,anexar));
                String linea = pelicula.getNombre();
                entrada.println(linea);
                entrada.close();
            }else{
                PrintWriter entrada = new PrintWriter(new FileWriter(archivo));
                String linea = pelicula.getNombre();
                entrada.println(linea);
                entrada.close();
            }
        }catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) {
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader salida = new BufferedReader(new FileReader(archivo));
            String linea;
            String encontrado = "No encontrado";
            linea = salida.readLine();
            while (linea != null) {
                if (buscar.equals(linea)) {
                    encontrado = linea;
                    return encontrado;
                }
                salida.readLine();
            }
            salida.close();
            return encontrado;
        }catch(IOException ioe){
            ioe.printStackTrace();
            return null;
        }
    }

    @Override
    public void crear(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try{
            PrintWriter entrada = new PrintWriter(new FileWriter(archivo));
            entrada.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }

    @Override
    public void borrar(String nombreARchivo){
        File archivo = new File(nombreARchivo);
        archivo.delete();
    }
}
