package Taller_Colecciones;

public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;
    private String genero;
    private String id;
    private static String criterio;

    public Persona(String nombre, int edad, String genero, String id) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public String getId() {
        return id;
    }


    public String getCriterio() {
        return criterio;
    }

    public static void setCriterio(String input) {
        criterio = input;
    }

    @Override
    public int compareTo(Persona otraPersona) {
        if(criterio.equals("edad")){
            return Integer.compare(this.edad, otraPersona.edad);
        }
        else{
            return this.nombre.compareTo(otraPersona.nombre);
        }
    }

    @Override
    public String toString() {
        return "(" + nombre + ", " + edad + ", " + genero + ", " + id + ")";
    }
}
