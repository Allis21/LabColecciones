package Taller_Colecciones.Punto16;

import Taller_Colecciones.Estudiante;
import Taller_Colecciones.Persona;
import Taller_Colecciones.Producto;

import java.util.Scanner;
import java.util.Stack;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Seleccione el tipo de objeto que desea filtrar:");
        System.out.println("1. Estudiante");
        System.out.println("2. Producto");
        System.out.println("3. Persona");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        Estudiante estudiante1 = new Estudiante("Ana", 20, "F", "101", "A123");
        Persona persona1 = new Persona("Juan", 16, "M", "123");
        Producto producto1 = new Producto("Gaseosa", "4567");
        Stack<Object> objectos = new Stack<>();
        objectos.add(estudiante1);
        objectos.add(producto1);
        objectos.add(persona1);
        
        Predicate<Object> condicion;

        switch (opcion) {
            case 1:
                condicion = objeto -> objeto.getClass().equals(Estudiante.class);
                break;
            case 2:
                condicion = objeto -> objeto.getClass().equals(Producto.class);
                break;
            case 3:
                condicion = objeto -> objeto.getClass().equals(Persona.class);
                break;
            default:
                System.out.println("Opción no válida. Se seleccionará la opción por defecto (Estudiante).");
                condicion = objeto -> objeto.getClass().equals(Estudiante.class);
        }

        Stack<Object> pilaFiltrada = retornarPilaObjetos(objectos, condicion);
        System.out.println("Pila filtrada por la condicion indicada por el usuario: " + pilaFiltrada);
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
