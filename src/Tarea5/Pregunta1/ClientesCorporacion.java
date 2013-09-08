package Tarea5.Pregunta1;

public class ClientesCorporacion {
    private String codigoCorporacion;
    private String nombreContacto;
    private String direccion;
    private String nombreLugar;
    private String calificacion;
    private double limiteCredito;

    public ClientesCorporacion(String codigoCorporacion, String nombreContacto, String direccion, String nombreLugar, String calificacion, double limiteCredito) {
        this.codigoCorporacion = codigoCorporacion;
        this.nombreContacto = nombreContacto;
        this.direccion = direccion;
        this.nombreLugar = nombreLugar;
        this.calificacion = calificacion;
        this.limiteCredito = limiteCredito;
    }

    public String getCodigoCorporacion() {
        return codigoCorporacion;
    }

    public void setCodigoCorporacion(String codigoCorporacion) {
        this.codigoCorporacion = codigoCorporacion;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreLugar() {
        return nombreLugar;
    }

    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    
    
}
