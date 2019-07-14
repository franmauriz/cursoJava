public class Main {
    public static void main(String args []){
        int a = 2;
        int b = 3;
        int res = -3 + 6 / ++a * 4 - b-- + b;

        System.out.println("-3 + 6 / ++a * 4 - b-- + b;");

        System.out.println("6/++a =>" + (6/3));

        System.out.println("-3 + 2 * 4 - b-- + b;");

        System.out.println("b-- + b => " + (2+2));

        System.out.println("-3 + 2 * 4 - 4;");

        System.out.println("2 * 4 => " + (2*4));

        System.out.println("-3 + 8 - 4;");

        System.out.println("-3 + 8 => " + (-3+8));

        System.out.println("5 - 4;");

        System.out.println("5 - 4 => " + (5-4));

        System.out.println("res = " + res);

        // 6/3 = 2 => -3 + 2 * 4 - b-- + b => -3 + 2 * 4 - 4 => -3 + 8 - 6
    }
}
