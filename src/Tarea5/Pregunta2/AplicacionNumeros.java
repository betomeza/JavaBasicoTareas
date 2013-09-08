package Tarea5.Pregunta2;

public class AplicacionNumeros {

    public static void main(String[] args) {
        AplicacionNumeros.muestraNumerosImpares();
        AplicacionNumeros.muestraNumerosPrimos();
    }
    
    public static void muestraNumerosImpares(){
        NumerosImpares hilo1= new NumerosImpares();
        hilo1.start();
    }

    public static void muestraNumerosPrimos(){
        NumerosPrimos hilo2= new NumerosPrimos();
        hilo2.start();
    }    
}
