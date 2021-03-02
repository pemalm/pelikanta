package fi.malm.Pelikanta.domain;

import javax.persistence.*;

@Entity
public class Peli {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String nimi;
    private String alusta;
    private String formaatti;
    private String vuosi;
    private String info;

    public Peli(){}

    public Peli(String nimi, String alusta, String formaatti, String vuosi, String info) {
        this.nimi = nimi;
        this.alusta = alusta;
        this.formaatti = formaatti;
        this.vuosi = vuosi;
        this.info = info;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getAlusta() {
        return alusta;
    }

    public void setAlusta(String alusta) {
        this.alusta = alusta;
    }

    public String getFormaatti() {
        return formaatti;
    }

    public void setFormaatti(String formaatti) {
        this.formaatti = formaatti;
    }

    public String getVuosi() {
        return vuosi;
    }

    public void setVuosi(String vuosi) {
        this.vuosi = vuosi;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String  info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Peli{" +
                "id=" + id +
                ", nimi='" + nimi + '\'' +
                ", alusta='" + alusta + '\'' +
                ", formaatti='" + formaatti + '\'' +
                ", vuosi=" + vuosi +
                ", info=" + info +
                '}';
    }
}
