package Tarea2.Pregunta2;

public class Test {

    public static void main(String[] args) {
        try {
            Util util = new Util(50);
            util.estaEnRango(50, 78, 100);
        } catch (FueraDeRangoException e) {
            System.out.println(e.getMessage());
        }
    }
}
