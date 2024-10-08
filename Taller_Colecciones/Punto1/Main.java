package Taller_Colecciones.Punto1;

import Taller_Colecciones.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String criterio = "edad";
        String criterio2 = "nombre";
        List<Persona> personas = new ArrayList<>();
        Persona persona1 = new Persona("Juan", 16, "M", "123");
        Persona persona2 = new Persona("Maria", 35, "F", "456");
        Persona persona3 = new Persona("Pedro", 36, "M", "789");
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);


        // PUNTO 1
        Persona.setCriterio(criterio);
        Collections.sort(personas);
        System.out.println("Ordenado por edad:  \n" + personas);
        Persona.setCriterio(criterio2);
        Collections.sort(personas);
        System.out.println("Ordenado por Nombre:  \n" + personas);
    }
}


