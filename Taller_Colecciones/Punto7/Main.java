package Taller_Colecciones.Punto7;

import Taller_Colecciones.Persona;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[]args){
        List<Persona> personas = new ArrayList<>();
        Persona persona1 = new Persona("Juan", 16, "M", "123");
        Persona persona2 = new Persona("Maria", 35, "F", "456");
        Persona persona3 = new Persona("Pedro", 36, "M", "789");
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);

        List<Persona> personasMayoresEdad = retornarMayoresEdad(personas);
        System.out.println("Personas Mayores de Edad: " + personasMayoresEdad);
    }

    public static List<Persona> retornarMayoresEdad(List<Persona> personas){
        List<Persona> personasFiltradas = new ArrayList<>();
        return listMayoresEdad(personas, personasFiltradas, 0);
    }

    public static List<Persona> listMayoresEdad(List<Persona> personas, List<Persona> listaFiltrada, int i){
        if(i==personas.size()) {
            return listaFiltrada;
        }

        Persona persona = personas.get(i);
        if(persona.getEdad()>18){
            listaFiltrada.add(persona);
        }
        return listMayoresEdad(personas, listaFiltrada, i+1);
    }
}
