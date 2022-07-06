
package DAO;

import java.util.ArrayList;
import Model.Usuario;

public interface UsuarioDAO {
    public ArrayList<Usuario> startSesion(String user, String clave);
    public boolean RegistrarUsuario(Usuario usuario);
    public boolean modificarContraseña(String correo, String contraseñaActual, String nuevaContraseña);
    public String verificarCorreo(String correo);
}
