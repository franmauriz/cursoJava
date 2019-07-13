public class Main {
    public static void main(String args []){
        int a=3, b=2;
        int c = a + b;

        System.out.println("c = " + c);

        System.out.println("Resultado: " + (a + b));
        System.out.println(a + b + " el resultado");
        
        int d = a - b;

        System.out.println("d = " + d);
        
        int e = a*b;

        System.out.println("e = " + e);
        
        double f = 3D /b;

        System.out.println("f = " + f);
        
        int g = a % b;

        System.out.println("g = " + g);

        int z = 5 % 2;
        System.out.println("z = " + z);
        if(z==0)
            System.out.println("Es par");
        else
            System.out.println("Es impar");
    }
}
