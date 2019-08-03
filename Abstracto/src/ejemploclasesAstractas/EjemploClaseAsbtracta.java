package ejemploclasesAstractas;
import abstracto.domain.*;

public class EjemploClaseAsbtracta {
    public static void main(String[] args) {
        FiguraGeometrica triangulo = new Triangulo("Triangulo");
        FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
        FiguraGeometrica circulo = new Circulo("Circulo");
        System.out.println(triangulo);
        triangulo.dibujar();
        System.out.println();
        System.out.println(rectangulo);
        rectangulo.dibujar();
        System.out.println();
        System.out.println(circulo);
        circulo.dibujar();

    }
}
