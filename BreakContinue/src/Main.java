public class Main {
    public static void main(String args []){
        for (var i=0;i<3;i++){
            if(i%2==0)
                System.out.println("i = " + i);
            break;
        }

        for(var i=0;i<3;i++){
            if(i%2!=0)
                continue;
            System.out.println(i);
        }
    }
}
