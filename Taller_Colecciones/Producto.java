package Taller_Colecciones;

import java.util.TreeSet;

public class Producto implements Comparable<Producto> {
    private String nombre;
    private String codigo;

    public Producto(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public int compareTo(Producto otro) {
        return this.codigo.compareTo(otro.getCodigo());
    }

    @Override
    public String toString() {
        return "(" + nombre + ", " + codigo + ")";
    }
}