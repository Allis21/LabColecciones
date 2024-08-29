package Taller_Colecciones.Punto9;

import Taller_Colecciones.Estudiante;
import Taller_Colecciones.Persona;
import Taller_Colecciones.Producto;

import java.util.Stack;
import java.util.function.Predicate;

public class Main {
    public static void main (String[]args){
        Estudiante estudiante1 = new Estudiante("Ana", 20, "F", "101", "A123");
        Persona persona1 = new Persona("Juan", 16, "M", "123");
        Producto producto1 = new Producto("Gaseosa", "4567");
        Stack<Object> objectos = new Stack<>();
        objectos.add(estudiante1);
        objectos.add(producto1);
        objectos.add(persona1);

        Predicate<Object> condicion = objeto -> objeto.getClass().equals(Estudiante.class);
        Stack<Object> pilaFiltrada = retornarPilaObjetos(objectos, condicion);
        System.out.println("Pila filtrada por la condicion indicada: " + pilaFiltrada);
    }

    public static Stack<Object> retornarPilaObjetos(Stack<Object> objectos, Predicate<Object> condicion){
        Stack<Object> cumplenCondicion = new Stack<>();

        return pilaObjectos(objectos, cumplenCondicion, 0, condicion);
    }

    public static Stack<Object> pilaObjectos(Stack<Object> objectos, Stack<Object> cumplenCondicion, int i, Predicate<Object> condicion){
        if(i==objectos.size()){
            return cumplenCondicion;
        }

        Object objeto = objectos.get(i);
        if(condicion.test(objeto)){
            cumplenCondicion.add(objeto);
        }
        return pilaObjectos(objectos, cumplenCondicion, i+1, condicion);
    }
}
