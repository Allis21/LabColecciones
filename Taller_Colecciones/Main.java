package Taller_Colecciones;

import java.util.*;
import java.util.function.Predicate;

public class Main{

    public static void main(String[] args) {

        String criterio = "edad";
        String criterio2 = "nombre";
        List<Persona> personas = new ArrayList<>();
        Persona persona1 = new Persona("Juan", 16, "M", "123");
        Persona persona2 = new Persona("Maria", 35, "F", "456");
        Persona persona3 = new Persona("Pedro", 36, "M", "789");
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);


        Map<String, Estudiante> mapEstudiantes = new HashMap<>();
        Estudiante estudiante1 = new Estudiante("Ana", 20, "F", "101", "A123");
        Estudiante estudiante2 = new Estudiante("Luis", 21, "M", "102", "A124");
        Estudiante estudiante3 = new Estudiante("Sofia", 22, "F", "103", "A125");
        mapEstudiantes.put(estudiante1.getMatricula(), estudiante1);
        mapEstudiantes.put(estudiante2.getMatricula(), estudiante2);
        mapEstudiantes.put(estudiante3.getMatricula(), estudiante3);

        String matriculaBuscada = "A125";
        Estudiante estudianteBuscado = mapEstudiantes.get(matriculaBuscada);

        // PUNTO 1
        Persona.setCriterio(criterio);
        Collections.sort(personas);
        System.out.println("Ordenado por edad:  \n" + personas);
        Persona.setCriterio(criterio2);
        Collections.sort(personas);
        System.out.println("Ordenado por Nombre:  \n" + personas);

        // PUNTO 2
        String codigoBuscar = "1234";
        TreeSet<Producto> productos = new TreeSet<>();
        Producto producto1 = new Producto("Gaseosa", "4567");
        Producto producto2 = new Producto("Papitas", "8900");
        Producto producto3 = new Producto("Gomitas", "1234");

        productos.add(producto1); productos.add(producto2); productos.add(producto3);

        Empresa empresa = new Empresa(productos);
        System.out.println("El producto con codigo " + codigoBuscar + " es " + empresa.buscarProducto(empresa.getProductos(), codigoBuscar).getCodigo());


        // PUNTO 3
        if(estudianteBuscado != null){
            System.out.println("Estudiante encontrado: " + estudianteBuscado + " con matrícula " + matriculaBuscada);
        } else {
            System.out.println("Estudiante no encontrado con matrícula " + matriculaBuscada);
        }

        List<String> elementos = new ArrayList<>();
        elementos.add("Juan");
        elementos.add("Maria");
        elementos.add("Pedro");
        elementos.add("Juan");

        Set<String> eliminaDuplicados = new LinkedHashSet<>(elementos);
        elementos.clear();
        elementos.addAll(eliminaDuplicados);

        // PUNTO 4
        Stack<Object> stack = new Stack<>();
        stack.add(estudiante1);
        stack.add(empresa);
        stack.add(producto1);

        agregarAPila(stack, estudiante1);

        // PUNTO 5
        ListIterator<String> listIterator = elementos.listIterator();
        while(listIterator.hasNext()) {
            String next = listIterator.next();
            System.out.println("[ " + next + " ]");
        }

        // PUNTO 6
        PriorityQueue<Tarea> tareas = new PriorityQueue<>();
        Tarea tarea1 = new Tarea("Tarea 1", 1);
        Tarea tarea2 = new Tarea("Tarea 2", 2);
        Tarea tarea3 = new Tarea("Tarea 3", 3);

        tareas.add(tarea3);
        tareas.add(tarea1);
        tareas.add(tarea2);

        while (!tareas.isEmpty()) {
            Tarea tarea = tareas.poll();
            System.out.println(tarea);
        }

        // PUNTO 7
        List<Persona> personasMayoresEdad = retornarMayoresEdad(personas);
        System.out.println("Personas Mayores de Edad: " + personasMayoresEdad);

        // PUNTO 8
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "MERA");
        mapa.put(2, "GGGG");
        mapa.put(3, "FFFF");
        mapa.put(4, "AYFKM");


       Map<Integer, String> mapaFiltrado = retornarClavesPares(mapa);
       System.out.println("Mapa con Key Par: " + mapaFiltrado);

        // punto 9
        Stack<Object> objectos = new Stack<>();
        objectos.add(estudiante1);
        objectos.add(producto1);
        objectos.add(persona1);

        Predicate<Object> condicion = objeto -> objeto.getClass().equals(Estudiante.class);
        Stack<Object> pilaFiltrada = retornarPilaObjetos(objectos, condicion);
        System.out.println("Pila filtrada por la condicion indicada: " + pilaFiltrada);

        // punto 10
        Queue<Producto> productosCola = new LinkedList<>();
        productosCola.add(producto1);
        productosCola.add(producto2);
        productosCola.add(producto3);

        Predicate<Producto> condicionProducto = producto -> producto.getNombre().equals("Gaseosa");
        Queue<Producto> productosFiltrados = retornarColaProductos(productosCola, condicionProducto);
        System.out.println("Productos filtrados por la condicion indicada: " + productosFiltrados);

        // punto 17
        // lista de productos con HashMap
        Map<String, String> listaProductos = new HashMap<>();
        listaProductos.put(producto1.getCodigo(), producto1.getNombre());
        listaProductos.put(producto2.getCodigo(), producto2.getNombre());
        listaProductos.put(producto3.getCodigo(), producto3.getNombre());

        /* HashMap = es rápido y eficiente pero no mantiene ningún orden.
        No garantiza ningún orden en particular para las claves. Los elementos pueden aparecer en cualquier orden al iterar sobre ellos.*/

        System.out.println("Lista de productos con HashMap: " + listaProductos);

        // lista de productos con LinkedHashMap
        Map<String, String> listaProductosLinked = new LinkedHashMap<>();
        listaProductosLinked.put(producto1.getCodigo(), producto1.getNombre());
        listaProductosLinked.put(producto2.getCodigo(), producto2.getNombre());
        listaProductosLinked.put(producto3.getCodigo(), producto3.getNombre());

        /* Mantiene el orden de inserción de los elementos.
        Esto significa que cuando iteras sobre el LinkedHashMap, los elementos aparecerán en el mismo orden en que fueron insertados.*/

        System.out.println("Lista de productos con LinkedHashMap: " + listaProductosLinked);

        // lista de productos con TreeMap
        Map<String, String> listaProductosTree = new TreeMap<>();
        listaProductosTree.put(producto1.getCodigo(), producto1.getNombre());
        listaProductosTree.put(producto2.getCodigo(), producto2.getNombre());
        listaProductosTree.put(producto3.getCodigo(), producto3.getNombre());

        /* TreeMap mantiene los elementos ordenados según las claves.
         Ordena los elementos según el orden natural de las claves o un comparador personalizado si se proporciona.
         En este caso, los productos se ordenarán alfabéticamente por su nombre.*/

        System.out.println("Lista de productos con TreeMap: " + listaProductosTree);



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

    public static void agregarAPila(Stack<Object> stack, Object objeto){
        if(stack.peek().getClass().equals(objeto.getClass())){
            stack.add(objeto);
        }
        else{
            System.out.println("No se puede añadir el objeto");
        }
    }

    public static List<Persona> retornarMayoresEdad(List<Persona> personas){
        List<Persona> personasFiltradas = new ArrayList<>();
        return listMayoresEdad(personas, personasFiltradas, 0);
    }

    public static List<Persona> listMayoresEdad(List<Persona> personas, List<Persona> listaFiltrada, int i){
        if(i==personas.size()) {
            return listaFiltrada;
        }

        Persona persona = personas.get(i);
        if(persona.getEdad()>18){
            listaFiltrada.add(persona);
        }
        return listMayoresEdad(personas, listaFiltrada, i+1);
    }

    public static Map<Integer, String> retornarClavesPares(Map<Integer, String> mapa){
        Map<Integer, String> mapaPar = new HashMap<>();
        Iterator<Map.Entry<Integer, String>> iterator = mapa.entrySet().iterator();

        return mapClavesPares(mapa, mapaPar, iterator);
    }

    public static Map<Integer, String> mapClavesPares(Map<Integer, String> mapa, Map<Integer, String> mapaPar, Iterator<Map.Entry<Integer, String>> iterator) {
        if (!iterator.hasNext()) {
            return mapaPar;
        }

        Map.Entry<Integer, String> siguiente = iterator.next();

        if (siguiente.getKey() % 2 == 0) {
            mapaPar.put(siguiente.getKey(), siguiente.getValue());
        }

        return mapClavesPares(mapa, mapaPar, iterator);


    }
}

