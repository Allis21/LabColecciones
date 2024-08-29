package Taller_Colecciones.Punto10;

import Taller_Colecciones.Producto;

import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Predicate;

public class Main {
    public static void main (String[]args){
        Producto producto1 = new Producto("Gaseosa", "4567");
        Producto producto2 = new Producto("Papitas", "8900");
        Producto producto3 = new Producto("Gomitas", "1234");

        Queue<Producto> productosCola = new LinkedList<>();
        productosCola.add(producto1);
        productosCola.add(producto2);
        productosCola.add(producto3);

        Predicate<Producto> condicionProducto = producto -> producto.getNombre().equals("Gaseosa");
        Queue<Producto> productosFiltrados = retornarColaProductos(productosCola, condicionProducto);
        System.out.println("Productos filtrados por la condicion indicada: " + productosFiltrados);
    }

    public static Queue<Producto> retornarColaProductos(Queue<Producto> productos, Predicate<Producto> condicion){
        Queue<Producto> cumplenCondicion = new LinkedList<>();
        return colaProductos(productos, cumplenCondicion, 0, condicion);
    }

    public static Queue<Producto> colaProductos(Queue<Producto> productos, Queue<Producto> cumplenCondicion, int i, Predicate<Producto> condicion){
        if(productos.isEmpty()){
            return cumplenCondicion;
        }

        Producto producto = productos.poll();
        if(producto != null && condicion.test(producto)){
            cumplenCondicion.add(producto);
        }
        return colaProductos(productos, cumplenCondicion, i+1, condicion);
    }
}
