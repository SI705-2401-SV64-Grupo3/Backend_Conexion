package pe.edu.upc.demogrupo3_sv64.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Metas")
public class Metas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMetas;
    @Column(name = "nameMetas", nullable = false, length = 35)
    private String nameMetas;

    @Column(name = "DescriptionMetas", nullable = false, length = 100)
    private String DescriptionMetas;

    public Metas(){

    }

    public Metas(int idMetas, String nameMetas, String descriptionMetas) {
        this.idMetas = idMetas;
        this.nameMetas = nameMetas;
        DescriptionMetas = descriptionMetas;
    }

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
}
