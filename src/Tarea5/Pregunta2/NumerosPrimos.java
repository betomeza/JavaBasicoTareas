package Tarea5.Pregunta2;

public class NumerosPrimos extends Thread {

    @Override
    public void run() {
        for (int i = 2; i <= 500; i++) {
            boolean sw=false;
            int cuenta=0;
            for (int j = 1; j <= i; j++) {
                if ((i % j) == 0) {
                    cuenta++;
                }
                if (cuenta > 2) {
                    sw = true;
                    continue;
                }
            }
            if (!sw) {
                System.out.println(i);
            }
        }
    }
}
