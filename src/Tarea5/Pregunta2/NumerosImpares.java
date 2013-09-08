package Tarea5.Pregunta2;

public class NumerosImpares extends Thread{
    
    @Override
    public void run() {
        for (int i = 99; i > 0; i=i-2) {
            System.out.println(i);
        }
    }    
    
}
