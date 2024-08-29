package Taller_Colecciones.Punto13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String []args){
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1); numeros.add(2); numeros.add(3); numeros.add(4); numeros.add(5);

        System.out.println(numeros);
        System.out.println("Numeros Pares: " + returnPares(numeros));
    }

    public static List<Integer> returnPares(List<Integer> numeros){
        List<Integer> numerosPares = new ArrayList<>();

        return retornarPares(numeros, numerosPares, 0);
    }

    public static List<Integer> retornarPares(List<Integer> numeros, List<Integer>pares, int i){
        if(i == numeros.size()){
            return pares;
        }

        if(numeros.get(i) % 2 == 0){
            pares.add(numeros.get(i));
        }

        return retornarPares(numeros, pares, i+1);
    }
}
