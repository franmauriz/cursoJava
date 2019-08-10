package mauriz.manejousuarios;
import mauriz.domain.Usuario;
import mauriz.datos.UsuarioJDBC;

import java.util.List;

public class ManejoUsuariosMysql {
    public static void main(String[] args) {
        UsuarioJDBC usuario = new UsuarioJDBC();
        //usuario.insert("Esther","Jaime");
        //usuario.update(1,"Fran","Mauriz");
        usuario.delete(2);
        /*List<Usuario> usuarios=usuario.select();
        for(Usuario usu:usuarios){
            System.out.println(usu);
        }*/

    }
}
