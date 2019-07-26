public class Matrices {
    public static void main(String[] args) {
        int edades[][];

        edades = new int [2][3];

        edades[0][0]=10;
        edades[0][1]=20;
        edades[0][2]=30;

        edades[1][0]=40;
        edades[1][1]=50;
        edades[1][2]=60;

        System.out.println("edades[0][0] = " + edades[0][0]);
        System.out.println("edades[0][1] = " + edades[0][1]);
        System.out.println("edades[0][2] = " + edades[0][2]);
        System.out.println("edades[1][0] = " + edades[1][0]);
        System.out.println("edades[1][1] = " + edades[1][1]);
        System.out.println("edades[1][2] = " + edades[1][2]);
        System.out.println();
        Persona personas[][] = new Persona[2][2];

        personas[0][0] = new Persona("juan");
        personas[0][1] = new Persona("pedro");

        System.out.println("personas[0][0] = " + personas[0][0]);
        System.out.println("personas[0][1] = " + personas[0][1]);
        System.out.println("personas[1][0] = " + personas[1][0]);
        System.out.println("personas[1][1] = " + personas[1][1]);
        System.out.println();
        String nombres[][] = {{"juan","Pedro"},{"Paloma","Blanca"}};

        for(int fila=0;fila<nombres.length;fila++){
            for(int columna=0;columna<nombres[fila].length;columna++){
                System.out.println("nombres [" + fila + "][" + columna + "] = " + nombres[fila][columna]);
            }
        }
    }
}
