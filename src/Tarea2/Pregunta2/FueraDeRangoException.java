package Tarea2.Pregunta2;

public class FueraDeRangoException extends Exception{
    
    public double valor, desde, hasta;
    
    public FueraDeRangoException(double valor, double desde, double hasta) {
        super("El valor "+ valor + " no se encuentra en elrango desde " + desde +" hasta " + hasta);

    this.valor = valor;
    this.desde = desde;
    this.hasta = hasta;
    }      
}
