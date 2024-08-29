package Taller_Colecciones.Punto11;
import Taller_Colecciones.Producto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>() ;
        Producto producto1 = new Producto("Gaseosa", "4567");
        Producto producto2 = new Producto("Papitas", "8900");
        Producto producto3 = new Producto("Gomitas", "1234");

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);

        ordenamientoRapido(productos, 0, productos.size() - 1);
        System.out.println("Ordenado por Codigo:  \n" + productos);
    }

    public static void ordenamientoRapido(List<Producto> productos, int inicio, int fin) {
        if (inicio < fin) {
            int indicePivote = particion(productos, inicio, fin);
            ordenamientoRapido(productos, inicio, indicePivote);
            ordenamientoRapido(productos, indicePivote + 1, fin);
        }
    }

    private static int particion(List<Producto> productos, int inicio, int fin) {
        Producto pivote = productos.get(inicio);
        int i = inicio;
        int j = fin;

        while (i < j) {
            while (i < j && productos.get(j).getCodigo().compareTo(pivote.getCodigo()) > 0) {
                j--;
            }
            intercambiar(productos, i, j);

            while (i < j && productos.get(i).getCodigo().compareTo(pivote.getCodigo()) <= 0) {
                i++;
            }
            intercambiar(productos, i, j);
        }

        return i;
    }

    private static void intercambiar(List<Producto> productos, int i, int j) {
        Producto temp = productos.get(i);
        productos.set(i, productos.get(j));
        productos.set(j, temp);
    }
}


