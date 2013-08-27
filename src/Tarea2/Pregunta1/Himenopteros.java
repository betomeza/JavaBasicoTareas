package Tarea2.Pregunta1;

public class Himenopteros {
    private String especie;
    private String caracteristica;
    private String rango;
    private String sexo;
    private String periodoDesarrollo;
    private String trabajo;
  
    public Himenopteros(String especie, String caracteristica, String rango, String sexo, String periodoDesarrollo, String trabajo) {
        this.especie = especie;
        this.caracteristica = caracteristica;
        this.rango = rango;
        this.sexo = sexo;
        this.periodoDesarrollo = periodoDesarrollo;
        this.trabajo = trabajo;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }    
    
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPeriodoDesarrollo() {
        return periodoDesarrollo;
    }

    public void setPeriodoDesarrollo(String periodoDesarrollo) {
        this.periodoDesarrollo = periodoDesarrollo;
    }
  
}
