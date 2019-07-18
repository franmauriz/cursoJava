public class Main {
    public static void main(String args []){
        var numero = 1;
        var texto = "Numero Desconocido";
        
        switch(numero){
            case 1:
                texto = "numero uno";
                break;
            case 2:
                texto = "numero dos";
                break;
            case 3:
                texto ="numero tres";
                break;
            default:
                texto = texto;
        }

        System.out.println("texto = " + texto);
    }
}
