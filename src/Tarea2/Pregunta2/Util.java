package Tarea2.Pregunta2;


public class Util {
 
    private long valor;

    public Util(long valor) {
        this.valor = valor;
    }
    
    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }
    
    public static void estaEnRango (double valor, double desde, double hasta) throws FueraDeRangoException {
        if ((valor > desde) & (valor < hasta)) {
            System.out.println("El valor : " + valor + " esta en el rango desde: " + desde + " hasta : " + hasta);            
        }else{
            throw new FueraDeRangoException(valor, desde, hasta);
        }
    }    
}
