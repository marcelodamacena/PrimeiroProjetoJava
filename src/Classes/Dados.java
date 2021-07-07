
package Classes;


public class Dados {
    public boolean ValidarUsuarios (String usuario,String senha){
        if (usuario.equals("admin") && senha.equals("admin")){
            return true;
            
        }else {
            return false;
        }
    }
}
