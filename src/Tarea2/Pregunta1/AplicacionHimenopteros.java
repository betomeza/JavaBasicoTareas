package Tarea2.Pregunta1;

import java.util.HashSet;
import java.util.Set;

public class AplicacionHimenopteros {

    public static void main(String[] args) {
        Himenopteros abeja1 = new Himenopteros("Abeja", "Eusocial", "Reina", "Hembra", "16 dias", "Aparear con zangano");
        Himenopteros abeja2 = new Himenopteros("Abeja", "Eusocial", "Obrera", "Hembra", "21 dias", "Construir celdas de panal, Recolectar, cuidar y alimentar larvas");
        Himenopteros abeja3 = new Himenopteros("Abeja", "Eusocial", "Zangano", "Macho", "23 dias", "Fecundar a la Reina, producir calor, repartir nectar");        
        Himenopteros abejorro1 = new Himenopteros("Abejorro", "Solitario", "Zangano", "Macho", "23 dias", "Fecundar a la Reina, producir calor, repartir nectar");        
        Himenopteros hormiga1 = new Himenopteros("Hormiga", "Semisocial", "Reina", "Hembra", "16 dias", "Aparear con zangano");        
        Himenopteros avispa1 = new Himenopteros("Avispa", "Semisocial", "Obrera", "Hembra", "21 dias", "Construir celdas de panal, Recolectar, cuidar y alimentar larvas");        
        
        Set<Himenopteros> listaHimenoptero = new HashSet<Himenopteros>();
        listaHimenoptero.add(abeja1);
        listaHimenoptero.add(abeja2);
        listaHimenoptero.add(avispa1);
        listaHimenoptero.add(abeja3);
        listaHimenoptero.add(abejorro1);
        listaHimenoptero.add(hormiga1);
        
            System.out.println("Especie   " 
                             + "Caracteristica   " + 
                               "Rango   " + 
                               "Sexo   " + 
                               "Periodo de Desarrollo    " + 
                               "Trabajo Desarrollado \n");

        
        for(Himenopteros a : listaHimenoptero){
            System.out.println(a.getEspecie() +  "   " +
                               a.getCaracteristica() + "   " + 
                               a.getRango() + "   " + 
                               a.getSexo() + "   " + 
                               a.getPeriodoDesarrollo() + "   " + 
                               a.getTrabajo() + "\n");
        }        
    }
}
