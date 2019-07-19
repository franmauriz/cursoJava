public class Main {
    public static void main(String args []){
        var texto = "Impresion infinita";
        int i=0;

        while(i<10){
            System.out.println("i = " + i);
            i++;
        }
        i=0;
        do{
            System.out.println("i = " + i);
            i++;
        }while(i < 3);
        
        for (i =0; i<3;i++){
            System.out.println("i = " + i);
        }

    }
}
