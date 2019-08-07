package cpjlaboratoriofinal;

import mx.com.gm.peliculas.negocio.*;
import mx.com.gm.peliculas.negocio.CatalogoPeliculas;

import java.util.Scanner;

public class CPJLaboratorioFinal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion;
        String nombreArchivo="/home/ptl28sev000/Documentos/git/cursoJava/LaboratorioFinal/datos.txt";
        CatalogoPeliculas catalogoPeliculas = new CatalogoPeliculasImpl();

        do{
            System.out.println("---------- MENU ---------------");
            System.out.println("1 . Iniciar Catalogo Peliculas.");
            System.out.println("2 . Agregar Pelicula.");
            System.out.println("3 . Listar Peliculas.");
            System.out.println("4 . Buscar Pelicula.");
            System.out.println("-------------------------------");
            System.out.println("0 . Salir.");
            opcion = scan.nextInt();
            if(opcion!=0){
                switch (opcion) {
                    case 1:
                        catalogoPeliculas.iniciarArchivo(nombreArchivo);
                        break;
                    case 2:
                        catalogoPeliculas.agregarPelicula("Terminator",nombreArchivo);
                        break;
                    case 3:
                        catalogoPeliculas.listarPeliculas(nombreArchivo);
                        break;
                    case 4:
                        catalogoPeliculas.buscarPelicula(nombreArchivo,"Terminator");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            }

        }while(opcion!=0);


    }
}
