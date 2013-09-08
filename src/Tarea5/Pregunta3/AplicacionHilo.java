package Tarea5.Pregunta3;

public class AplicacionHilo {

    public static void main(String[] args) {
        Hilo hilo1 = new Hilo(2, 20, 1000, 2);
        hilo1.start();
    }
}
