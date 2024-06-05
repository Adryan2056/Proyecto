
package Modelo;

public class Medico extends Usuario{

    public Medico(int id, String nombre, String apellido_paterno, String apellido_materno, String telefono, String direccion, String correo, String curp, String contraseña) {
        super(id, nombre, apellido_paterno, apellido_materno, telefono, direccion, correo, curp, contraseña);
    }

    public Medico() {
    }
    
}
