package abstracto.domain;

public class Circulo extends FiguraGeometrica{

    public Circulo(String tipoFigura){
        super(tipoFigura);
    }

    public void dibujar(){
        System.out.println("Dibujar un: " + this.getClass().getCanonicalName());
    }
}
