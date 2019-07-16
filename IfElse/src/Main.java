public class Main {
    public static void main(String args []){
        var numero=2;
        var texto="numero desconocido";

        if (numero==1){
            texto = "numero 1";
        }else if(numero==2){
            texto = "numero dos";
        }else if(numero==3){
            texto = "numero tres";
        }else{
            texto = texto;
        }

        System.out.println("texto = " + texto);
    }
}
