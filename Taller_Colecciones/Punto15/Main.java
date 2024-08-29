package Taller_Colecciones.Punto15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main (String[]args){
        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(1, "hola");
        mapa.put(2, "Mundo");
        mapa.put(3, "This");
        mapa.put(4, "lol");
        mapa.put(5, "oli");

        System.out.println(mapa);
        System.out.println("Cadenas que empiezan por minuscula: " + retornarClavesMinus(mapa));
    }

    public static Map<Integer, String> retornarClavesMinus(Map<Integer, String> mapa){
        Map<Integer, String> mapaMinus = new HashMap<>();
        Iterator<Map.Entry<Integer, String>> iterator = mapa.entrySet().iterator();

        return mapClavesMinus(mapa, mapaMinus, iterator);
    }

    public static Map<Integer, String> mapClavesMinus(Map<Integer, String> mapa, Map<Integer, String> mapaMinus, Iterator<Map.Entry<Integer, String>> iterator) {
        if (!iterator.hasNext()) {
            return mapaMinus;
        }

        Map.Entry<Integer, String> siguiente = iterator.next();
        String palabra = siguiente.getValue();
        char caracter = palabra.charAt(0);

        if (Character.isLowerCase(caracter)) {
            mapaMinus.put(siguiente.getKey(), siguiente.getValue());
        }

        return mapClavesMinus(mapa, mapaMinus, iterator);
    }
}
