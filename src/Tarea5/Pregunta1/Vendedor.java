package Tarea5.Pregunta1;

public class Vendedor extends Personas {

    private String  codigoVendedor;
    private double sueldoBase;
    private float porcentajeComision;

    public Vendedor(String codigoVendedor, double sueldoBase, float porcentajeComision, int dni, String apellidoPaterno, String apellidoMaterno, String nombres) {
        super(dni, apellidoPaterno, apellidoMaterno, nombres);
        this.codigoVendedor = codigoVendedor;
        this.sueldoBase = sueldoBase;
        this.porcentajeComision = porcentajeComision;
    }

    public String getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(String codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public float getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(float porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }
    
    
}
