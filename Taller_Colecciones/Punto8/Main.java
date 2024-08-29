package Taller_Colecciones.Punto8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main (String[]args){
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "MERA");
        mapa.put(2, "GGGG");
        mapa.put(3, "FFFF");
        mapa.put(4, "AYFKM");


        Map<Integer, String> mapaFiltrado = retornarClavesPares(mapa);
        System.out.println("Mapa con Key Par: " + mapaFiltrado);
    }

    public static Map<Integer, String> retornarClavesPares(Map<Integer, String> mapa){
        Map<Integer, String> mapaPar = new HashMap<>();
        Iterator<Map.Entry<Integer, String>> iterator = mapa.entrySet().iterator();

        return mapClavesPares(mapa, mapaPar, iterator);
    }

    public static Map<Integer, String> mapClavesPares(Map<Integer, String> mapa, Map<Integer, String> mapaPar, Iterator<Map.Entry<Integer, String>> iterator) {
        if (!iterator.hasNext()) {
            return mapaPar;
        }

        Map.Entry<Integer, String> siguiente = iterator.next();

        if (siguiente.getKey() % 2 == 0) {
            mapaPar.put(siguiente.getKey(), siguiente.getValue());
        }

        return mapClavesPares(mapa, mapaPar, iterator);
    }
}
