package Tarea5.Pregunta1;

import java.util.Date;

public class Ventas {
    private String codigoVenta;
    private String tipoCliente;
    private String codigoCliente;
    private String tipoVenta;
    private double montoTotal;
    private String numeroFactura;
    private Date fechaVenta;

    public Ventas(String codigoVenta, String tipoCliente, String codigoCliente, String tipoVenta, double montoTotal, String numeroFactura, Date fechaVenta) {
        this.codigoVenta = codigoVenta;
        this.tipoCliente = tipoCliente;
        this.codigoCliente = codigoCliente;
        this.tipoVenta = tipoVenta;
        this.montoTotal = montoTotal;
        this.numeroFactura = numeroFactura;
        this.fechaVenta = fechaVenta;
    }

    public String getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(String codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getTipoVenta() {
        return tipoVenta;
    }

    public void setTipoVenta(String tipoVenta) {
        this.tipoVenta = tipoVenta;
    }
    
    
}
