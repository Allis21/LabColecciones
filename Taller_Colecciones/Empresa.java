package Taller_Colecciones;

import java.util.Iterator;
import java.util.TreeSet;

public class Empresa {
    private TreeSet<Producto> productos = new TreeSet<>();

    public Empresa(TreeSet<Producto> productos) {
        this.productos = productos;
    }

    public TreeSet<Producto> getProductos() {
        return productos;
    }

    public Producto buscarProducto(TreeSet<Producto> productos, String codigo){
        Iterator<Producto> iterator = productos.iterator();

        Producto productoEncontrado = new Producto();

        while(iterator.hasNext()) {
            Producto producto = iterator.next();
            if(producto.getCodigo().equals(codigo)){
                productoEncontrado = producto;
            }
        }
        return productoEncontrado;
    }
}
