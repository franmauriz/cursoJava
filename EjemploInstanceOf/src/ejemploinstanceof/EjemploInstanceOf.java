package ejemploinstanceof;

public class EjemploInstanceOf {
    public static void main(String[] args) {
        FiguraGeometrica fig = new FiguraGeometrica();
        fig = new Elipse();

        determinarTipo(fig);

        System.out.println();
        System.out.println("Todos los tipòs");
        determinarTodosLosTipos(fig);
        System.out.println("________________________________");
        fig = new Triangulo();
        determinarTipo(fig);
        determinarTodosLosTipos(fig);
    }

    public static void determinarTipo(FiguraGeometrica fig){
        if(fig instanceof Elipse){
            System.out.println("Es una Elipse");
        }else if(fig instanceof Circulo){
            System.out.println("Es un Circulo");
        }else if(fig instanceof FiguraGeometrica){
            System.out.println("Es una Figura Geometrica");
        }else if(fig instanceof Object){
            System.out.println("Es un Objeto");
        }else{
            System.out.println("No se encontro el tipo");
        }
    }

    public static void determinarTodosLosTipos(FiguraGeometrica fig){
        if(fig instanceof Elipse){
            System.out.println("Es una Elipse");
        }
        if(fig instanceof Circulo){
            System.out.println("Es un Circulo");
        }
        if(fig instanceof FiguraGeometrica){
            System.out.println("Es una Figura Geometrica");
        }
        if(fig instanceof Object){
            System.out.println("Es un objeto");
        }else{
            System.out.println("No se encontro el tipo");
        }
    }
}
