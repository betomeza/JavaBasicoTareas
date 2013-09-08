package Tarea5.Pregunta3;

public class Hilo extends Thread {

    private int inicio;
    private int fin;
    private int retardo;
    private int razon;

    public Hilo(int inicio, int fin, int retardo, int razon) {
        this.inicio = inicio;
        this.fin = fin;
        this.retardo = retardo;
        this.razon = razon;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public int getRetardo() {
        return retardo;
    }

    public void setRetardo(int retardo) {
        this.retardo = retardo;
    }

    public int getRazon() {
        return razon;
    }

    public void setRazon(int razon) {
        this.razon = razon;
    }

    @Override
    public void run() {
        inicio = this.inicio;
        fin = this.fin;
        razon = this.razon;
        retardo = this.retardo;
        for (int i = inicio; i <= fin; i = i + razon) {         
            if (((inicio + fin) / 2) == i) {
                this.setRetardo(2 * retardo);
            } 
            try {
                Thread.sleep(this.getRetardo());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
