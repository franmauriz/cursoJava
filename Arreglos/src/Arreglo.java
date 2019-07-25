public class Arreglo {
    public static void main(String[] args) {
        Persona persona1[];
        int edades[] = new int[3];

        edades[0]=30;
        edades[1]=15;

        System.out.println("edades[0] = " + edades[0]);
        System.out.println("edades[1] = " + edades[1]);

        persona1 = new Persona[3];

        persona1[0]= new Persona("Juan");
        persona1[1]= new Persona("carla");

        System.out.println("persona1[0] = " + persona1[0]);
        System.out.println("persona1[1] = " + persona1[1]);
        System.out.println("persona1[2] = " + persona1[2]);


        String nombres[] = {"Sara","laura","Carlos","Carmen"};

        for(int i=0;i< nombres.length;i++){
            System.out.println("nombres[" + i +"] = " + nombres[i]);
        }
    }
}
