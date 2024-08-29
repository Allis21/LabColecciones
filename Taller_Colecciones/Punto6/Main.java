package Taller_Colecciones.Punto6;

import Taller_Colecciones.Tarea;

import java.util.PriorityQueue;

public class Main {
    public static void main (String[]args){
        PriorityQueue<Tarea> tareas = new PriorityQueue<>();
        Tarea tarea1 = new Tarea("Tarea 1", 1);
        Tarea tarea2 = new Tarea("Tarea 2", 2);
        Tarea tarea3 = new Tarea("Tarea 3", 3);

        tareas.add(tarea3);
        tareas.add(tarea1);
        tareas.add(tarea2);

        while (!tareas.isEmpty()) {
            Tarea tarea = tareas.poll();
            System.out.println(tarea);
        }
    }
}
