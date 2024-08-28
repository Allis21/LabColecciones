package Taller_Colecciones.Punto2;

import Taller_Colecciones.Empresa;
import Taller_Colecciones.Producto;

import java.util.TreeSet;

public class Main {
    public static void main (String[]args){
        String codigoBuscar = "1234";
        TreeSet<Producto> productos = new TreeSet<>();
        Producto producto1 = new Producto("Gaseosa", "4567");
        Producto producto2 = new Producto("Papitas", "8900");
        Producto producto3 = new Producto("Gomitas", "1234");

        productos.add(producto1); productos.add(producto2); productos.add(producto3);

        Empresa empresa = new Empresa(productos);
        System.out.println(productos);
        System.out.println("El producto con codigo " + codigoBuscar + " es " + empresa.buscarProducto(empresa.getProductos(), codigoBuscar).getNombre());


    }

}
