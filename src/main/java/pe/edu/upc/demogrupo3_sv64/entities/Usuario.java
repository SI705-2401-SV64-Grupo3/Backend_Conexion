package pe.edu.upc.demogrupo3_sv64.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column (name = "userUsuario", nullable = false, length = 10)
    private String userUsuario;
    @Column (name = "passwordUsuario", nullable = false, length = 10)
    private String passwordUsuario;
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

    public Usuario() {
    }

    public Usuario(int idUsuario, String userUsuario, String passwordUsuario, String nameUsuario, String lastnameUsuario, String mailUsuario, LocalDate birthdateUsuario, String genderUsuario, String descriptionUsuario, String preferencesUsuario) {
        this.idUsuario = idUsuario;
        this.userUsuario = userUsuario;
        this.passwordUsuario = passwordUsuario;
        this.nameUsuario = nameUsuario;
        this.lastnameUsuario = lastnameUsuario;
        this.mailUsuario = mailUsuario;
        this.birthdateUsuario = birthdateUsuario;
        this.genderUsuario = genderUsuario;
        this.descriptionUsuario = descriptionUsuario;
        this.preferencesUsuario = preferencesUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUserUsuario() {
        return userUsuario;
    }

    public void setUserUsuario(String userUsuario) {
        this.userUsuario = userUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
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
}
