package pe.edu.upc.demogrupo3_sv64.dtos;

import pe.edu.upc.demogrupo3_sv64.entities.Usuario;

public class MetasDTO {

    private int idMetas;

    private String nameMetas;

    private String DescriptionMetas;

    private Usuario usuario;

    public int getIdMetas() {
        return idMetas;
    }

    public void setIdMetas(int idMetas) {
        this.idMetas = idMetas;
    }

    public String getNameMetas() {
        return nameMetas;
    }

    public void setNameMetas(String nameMetas) {
        this.nameMetas = nameMetas;
    }

    public String getDescriptionMetas() {
        return DescriptionMetas;
    }

    public void setDescriptionMetas(String descriptionMetas) {
        DescriptionMetas = descriptionMetas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}


