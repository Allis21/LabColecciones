package Taller_Colecciones;

public class Tarea implements Comparable<Tarea>{
    private String nombre;
    private int prioridad;

    public Tarea(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Tarea otraTarea) {
        return Integer.compare(otraTarea.getPrioridad(), this.prioridad);
    }

    @Override
    public String toString() {
        return  nombre + " , " + prioridad ;
    }
}
