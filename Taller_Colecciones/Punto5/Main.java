package Taller_Colecciones.Punto5;

import java.util.*;

public class Main {
    public static void main (String[]args){

        List<String> elementos = new ArrayList<>();
        elementos.add("Juan");
        elementos.add("Maria");
        elementos.add("Pedro");
        elementos.add("Juan");

        Set<String> eliminaDuplicados = new LinkedHashSet<>(elementos);
        elementos.clear();
        elementos.addAll(eliminaDuplicados);

        ListIterator<String> listIterator = elementos.listIterator();
        while(listIterator.hasNext()) {
            String next = listIterator.next();
            System.out.println("[ " + next + " ]");
        }
    }
}
