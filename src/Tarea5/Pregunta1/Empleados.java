package Tarea5.Pregunta1;

public class Empleados extends Personas{
    
    private String codigoEmpleado;
    private String cargo;
    private double sueldoMensual;
    private String seguro;
    private float porcentajeSeguro;

    public Empleados(String cargo, double sueldoMensual, String seguro, float porcentajeSeguro, int dni, String apellidoPaterno, String apellidoMaterno, String nombres) {
        super(dni, apellidoPaterno, apellidoMaterno, nombres);
        this.cargo = cargo;
        this.sueldoMensual = sueldoMensual;
        this.seguro = seguro;
        this.porcentajeSeguro = porcentajeSeguro;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public float getPorcentajeSeguro() {
        return porcentajeSeguro;
    }

    public void setPorcentajeSeguro(float porcentajeSeguro) {
        this.porcentajeSeguro = porcentajeSeguro;
    }    

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }
}
