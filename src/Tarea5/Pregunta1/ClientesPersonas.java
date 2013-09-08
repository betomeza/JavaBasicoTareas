package Tarea5.Pregunta1;

public class ClientesPersonas extends Personas{

    private String codigolCliente;
    private String tarjetaCredito;
    private String numeroTarjetaCredito;

    public ClientesPersonas(String codigolCliente, String tarjetaCredito, String numeroTarjetaCredito, int dni, String apellidoPaterno, String apellidoMaterno, String nombres) {
        super(dni, apellidoPaterno, apellidoMaterno, nombres);
        this.codigolCliente = codigolCliente;
        this.tarjetaCredito = tarjetaCredito;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public String getCodigolCliente() {
        return codigolCliente;
    }

    public void setCodigolCliente(String codigolCliente) {
        this.codigolCliente = codigolCliente;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }

    public void setNumeroTarjetaCredito(String numeroTarjetaCredito) {
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }    
}
