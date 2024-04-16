package pe.edu.upc.demogrupo3_sv64.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="roles", uniqueConstraints = {@UniqueConstraint(columnNames = {"usuario_id", "rol"})})
public class Rol implements Serializable{


    private static final long serialVersionUID= 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "rol", nullable = false, length = 50)
    private String rol;
    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    public Rol() {
    }

    public Rol(int id, String rol, Usuario usuario) {
        this.id = id;
        this.rol = rol;
        this.usuario = usuario;
    }

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
