package mauriz.fran.enumeracion;

public class Enumeraciones {
    public static void main(String[] args) {
        // imprimir valor de DIA lunes
        System.out.println(Dias.LUNES);
        //Comprobamos DIA
        indicarDia(Dias.DOMINGO);
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println(Continentes.AFRICA);
        System.out.println(Continentes.AFRICA.getPaises());
        indicarContinentes(Continentes.AFRICA);
        System.out.println();
        System.out.println("----------------------------------------------------");
        imprimirContinentes();
    }

    public static  void imprimirContinentes(){
        for (Continentes continente:Continentes.values()) {
            System.out.println("El continente " + continente + " tiene " + continente.getPaises() + " paises");
        }
    }

    public static  void indicarContinentes(Continentes continentes){
        switch(continentes){
            case AFRICA:
                System.out.println("El continente " + continentes + " tiene " + continentes.getPaises() + " paises");
        }
    }

    public static void indicarDia(Dias dia){
        switch (dia){
            case LUNES:
                System.out.println("Primer día de la semana");
                break;
            case MARTES:
                System.out.println("Segundo día de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer día de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto día de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto día de la semana");
                break;
            case SABADO:
                System.out.println("Sexto día de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo día de la semana");
                break;
        }
    }
}
