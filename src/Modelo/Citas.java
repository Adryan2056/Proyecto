
package Modelo;


public class Citas {
    
    private int id;
    private int usuarioId;
    private String fechaCita;

    public Citas(int id, int usuarioId, String fechaCita) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.fechaCita = fechaCita;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }
    
    
   

}
