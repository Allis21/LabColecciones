package Taller_Colecciones;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String criterio = "edad";
        String criterio2 = "nombre";

        List<Persona> personas = new ArrayList<>();
        Map<String, Estudiante> mapEstudiantes = new HashMap<>();


        Persona persona1 = new Persona("Juan", 40, "M", "123");
        Persona persona2 = new Persona("Maria", 35, "F", "456");
        Persona persona3 = new Persona("Pedro", 36, "M", "789");

        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);

        Estudiante estudiante1 = new Estudiante("Ana", 20, "F", "101", "A123");
        Estudiante estudiante2 = new Estudiante("Luis", 21, "M", "102", "A124");
        Estudiante estudiante3 = new Estudiante("Sofia", 22, "F", "103", "A125");

        mapEstudiantes.put(estudiante1.getMatricula(), estudiante1);
        mapEstudiantes.put(estudiante2.getMatricula(), estudiante2);
        mapEstudiantes.put(estudiante3.getMatricula(), estudiante3);

        String matriculaBuscada = "A125";
        Estudiante estudianteBuscado = mapEstudiantes.get(matriculaBuscada);

        // punto 1
        Persona.setCriterio(criterio);
        Collections.sort(personas);
        System.out.println("Ordenado por edad:  \n" + personas);

        Persona.setCriterio(criterio2);
        Collections.sort(personas);
        System.out.println("Ordenado por Nombre:  \n" + personas);

        // punto 3
        if(estudianteBuscado != null){
            System.out.println("Estudiante encontrado: " + estudianteBuscado + " con matrícula " + matriculaBuscada);
        } else {
            System.out.println("Estudiante no encontrado con matrícula " + matriculaBuscada);
        }
    }
}
