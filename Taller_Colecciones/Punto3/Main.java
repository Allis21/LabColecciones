package Taller_Colecciones.Punto3;

import Taller_Colecciones.Estudiante;

import java.util.*;

public class Main {
    public static void main(String[]args){

        Map<String, Estudiante> mapEstudiantes = new HashMap<>();
        Estudiante estudiante1 = new Estudiante("Ana", 20, "F", "101", "A123");
        Estudiante estudiante2 = new Estudiante("Luis", 21, "M", "102", "A124");
        Estudiante estudiante3 = new Estudiante("Sofia", 22, "F", "103", "A125");
        mapEstudiantes.put(estudiante1.getMatricula(), estudiante1);
        mapEstudiantes.put(estudiante2.getMatricula(), estudiante2);
        mapEstudiantes.put(estudiante3.getMatricula(), estudiante3);

        String matriculaBuscada = "A125";
        Estudiante estudianteBuscado = mapEstudiantes.get(matriculaBuscada);

        
        if(estudianteBuscado != null){
            System.out.println("Estudiante encontrado: " + estudianteBuscado + " con matrícula " + matriculaBuscada);
        } else {
            System.out.println("Estudiante no encontrado con matrícula " + matriculaBuscada);
        }

        List<String> elementos = new ArrayList<>();
        elementos.add("Juan");
        elementos.add("Maria");
        elementos.add("Pedro");
        elementos.add("Juan");

        Set<String> eliminaDuplicados = new LinkedHashSet<>(elementos);
        elementos.clear();
        elementos.addAll(eliminaDuplicados);
    }
}
