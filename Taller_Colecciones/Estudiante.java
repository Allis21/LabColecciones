package Taller_Colecciones;

public class Estudiante extends Persona{

    private String matricula;

    public Estudiante(String nombre, int edad, String genero, String id, String matricula) {
        super(nombre, edad, genero, id);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }


}
