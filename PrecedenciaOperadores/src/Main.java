public class Main {
    public static void main(String args []) {
        int x = 5;
        int y = 10;
        int z = ++x + y--; // x =6 , y=10 z =16

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        System.out.println("Ejemplo precedencia operadores");
        var resultado = 4 + 5 * 6 / 3; // 4+(5*6)/3 => 4+30/3 => 4+10 =>14;
        System.out.println("resultado = " + resultado);
        
        resultado = (4+5)*(6/3); // 9*2 =18
        System.out.println("resultado = " + resultado);
    }
}
