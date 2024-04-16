package pe.edu.upc.demogrupo3_sv64.dtos;

import pe.edu.upc.demogrupo3_sv64.entities.Usuario;

public class RolDTO {
    private int id;
    private String rol;
    private Usuario usuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
