package manejojavabeans;
import beans.PersonaBean;

public class ManejoJavaBeans {
    public static void main(String[] args) {
        PersonaBean bean = new PersonaBean();
        bean.setNombre("juan");
        bean.setEdad(23);

        System.out.println("Nombre = " + bean.getNombre());
        System.out.println("Edad = " + bean.getEdad());
    }
}
