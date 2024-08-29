package Taller_Colecciones.Punto14;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[]args){
        List<String> cadenas = new ArrayList<>();
        cadenas.add("Hola"); cadenas.add("mundo"); cadenas.add("Programación"); cadenas.add("estructuras");

        System.out.println(cadenas);
        System.out.println("Cadenas que comienzan con mayúscula: " + returnCadenasMayus(cadenas));
    }

    public static List<String> returnCadenasMayus(List<String> cadenas){
        List<String> cadenasMayus = new ArrayList<>();

        return cadenasStartMayus(cadenas, cadenasMayus, 0);
    }

    public static List<String> cadenasStartMayus(List<String> cadenas, List<String> cadenasMayus, int i){
        if(i == cadenas.size()){
            return cadenasMayus;
        }

        String palabra = cadenas.get(i);
        char caracter = palabra.charAt(0);

        if(Character.isUpperCase(caracter)){
            cadenasMayus.add(palabra);
        }

        return cadenasStartMayus(cadenas, cadenasMayus, i+1);
    }
}
