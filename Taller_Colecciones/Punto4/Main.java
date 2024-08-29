package Taller_Colecciones.Punto4;

import Taller_Colecciones.Estudiante;
import Taller_Colecciones.Persona;
import Taller_Colecciones.Producto;

import java.util.Stack;

public class Main {
    public static void main(String[]args){
        Estudiante estudiante1 = new Estudiante("Ana", 20, "F", "101", "A123");
        Persona persona1 = new Persona("Juan", 16, "M", "123");
        Producto producto1 = new Producto("Gaseosa", "4567");

        Stack<Object> stack = new Stack<>();
        stack.add(estudiante1);
        stack.add(persona1);
        stack.add(producto1);

        agregarAPila(stack, estudiante1);
    }

    public static void agregarAPila(Stack<Object> stack, Object objeto){
        if(stack.peek().getClass().equals(objeto.getClass())){
            stack.add(objeto);
        }
        else{
            System.out.println("No se puede añadir. El objeto debe ser de tipo " + stack.peek().getClass().getSimpleName());
        }
    }
}
