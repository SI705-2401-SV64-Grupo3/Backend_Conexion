package pe.edu.upc.demogrupo3_sv64.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.time.LocalDate;

public class UsuarioDTO {


    private int idUsuario;

    private String username;

    private String password;

    private String nameUsuario;

    private String lastnameUsuario;

    private String mailUsuario;

    private LocalDate birthdateUsuario;

    private String genderUsuario;

    private String descriptionUsuario;

    private String preferencesUsuario;

    private Boolean enabled;

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
}
