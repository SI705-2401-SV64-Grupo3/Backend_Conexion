package pe.edu.upc.demogrupo3_sv64.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table (name="usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column (name = "username", nullable = false, length = 200)
    private String username;
    @Column (name = "password", nullable = false, length = 200)
    private String password;
    @Column (name = "nameUsuario", nullable = false, length = 50)
    private String nameUsuario;
    @Column (name = "lastnameUsuario", nullable = false, length = 50)
    private String lastnameUsuario;
    @Column (name = "mailUsuario", nullable = false, length = 45)
    private String mailUsuario;
    @Column (name = "birthdateUsuario", nullable = false)
    private LocalDate birthdateUsuario;
    @Column (name = "genderUsuario", nullable = false, length = 10)
    private String genderUsuario;
    @Column (name = "descriptionUsuario", nullable = false, length = 200)
    private String descriptionUsuario;
    @Column (name = "preferencesUsuario", nullable = false, length = 200)
    private String preferencesUsuario;

    private Boolean enabled;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id")
    private List<Rol> roles;

    public Usuario() {
    }

    public Usuario(int idUsuario, String username, String password, String nameUsuario, String lastnameUsuario, String mailUsuario, LocalDate birthdateUsuario, String genderUsuario, String descriptionUsuario, String preferencesUsuario, Boolean enabled, List<Rol> roles) {
        this.idUsuario = idUsuario;
        this.username = username;
        this.password = password;
        this.nameUsuario = nameUsuario;
        this.lastnameUsuario = lastnameUsuario;
        this.mailUsuario = mailUsuario;
        this.birthdateUsuario = birthdateUsuario;
        this.genderUsuario = genderUsuario;
        this.descriptionUsuario = descriptionUsuario;
        this.preferencesUsuario = preferencesUsuario;
        this.enabled = enabled;
        this.roles = roles;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNameUsuario() {
        return nameUsuario;
    }

    public void setNameUsuario(String nameUsuario) {
        this.nameUsuario = nameUsuario;
    }

    public String getLastnameUsuario() {
        return lastnameUsuario;
    }

    public void setLastnameUsuario(String lastnameUsuario) {
        this.lastnameUsuario = lastnameUsuario;
    }

    public String getMailUsuario() {
        return mailUsuario;
    }

    public void setMailUsuario(String mailUsuario) {
        this.mailUsuario = mailUsuario;
    }

    public LocalDate getBirthdateUsuario() {
        return birthdateUsuario;
    }

    public void setBirthdateUsuario(LocalDate birthdateUsuario) {
        this.birthdateUsuario = birthdateUsuario;
    }

    public String getGenderUsuario() {
        return genderUsuario;
    }

    public void setGenderUsuario(String genderUsuario) {
        this.genderUsuario = genderUsuario;
    }

    public String getDescriptionUsuario() {
        return descriptionUsuario;
    }

    public void setDescriptionUsuario(String descriptionUsuario) {
        this.descriptionUsuario = descriptionUsuario;
    }

    public String getPreferencesUsuario() {
        return preferencesUsuario;
    }

    public void setPreferencesUsuario(String preferencesUsuario) {
        this.preferencesUsuario = preferencesUsuario;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }
}
