public class Aritmetica {

    int a;
    int b;

    Aritmetica(){

    }

    Aritmetica(int a,int b){
        this.a = a;
        this.b = b;
    }

    public int sumar(){
        return (a + b);
    }

    int restar(){
        return a-b;
    }

    int multiplica(){
        return a*b;
    }

    int dividir(){
        return a/b;
    }
}
