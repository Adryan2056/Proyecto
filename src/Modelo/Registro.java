
package Modelo;

   import java.util.ArrayList;

public class Registro {
    
    private ArrayList<Usuario> usuarios;

    public Registro() {
        usuarios = new ArrayList<>();
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario iniciarSesion(String correo, String contraseña) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCorreo().equals(correo) && usuario.getContraseña().equals(contraseña)) {
                return usuario;
            }
        }
        return null;
    }
}
