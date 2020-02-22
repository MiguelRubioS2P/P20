package cat.paucasesnovescifp.sppsp.models;

import java.io.Serializable;

public class Persona implements Serializable {

    private String nom;
    private String cognom;
    private int edat;
    private String carrer;
    private String municipi;
    private int codiPostal;
    private String pais;
    private int telefon;
    private String email;

    public Persona(String nom, String cognom) {
        this.nom = nom;
        this.cognom = cognom;
    }

    public Persona(String nom, String cognom, int edat, String carrer, String municipi, int codiPostal, String pais, int telefon, String email) {
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
        this.carrer = carrer;
        this.municipi = municipi;
        this.codiPostal = codiPostal;
        this.pais = pais;
        this.telefon = telefon;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public String getCarrer() {
        return carrer;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    public String getMunicipi() {
        return municipi;
    }

    public void setMunicipi(String municipi) {
        this.municipi = municipi;
    }

    public int getCodiPostal() {
        return codiPostal;
    }

    public void setCodiPostal(int codiPostal) {
        this.codiPostal = codiPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nom='" + nom + '\'' +
                ", cognom='" + cognom + '\'' +
                ", edat=" + edat +
                ", carrer='" + carrer + '\'' +
                ", municipi='" + municipi + '\'' +
                ", codiPostal=" + codiPostal +
                ", pais='" + pais + '\'' +
                ", telefon=" + telefon +
                ", email='" + email + '\'' +
                '}';
    }
}
