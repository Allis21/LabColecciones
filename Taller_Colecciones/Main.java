package Taller_Colecciones;

import java.util.*;

public class Main{

    public static void main(String[] args) {

        String criterio = "edad";
        String criterio2 = "nombre";
        List<Persona> personas = new ArrayList<>();
        Map<String, Estudiante> mapEstudiantes = new HashMap<>();


        Persona persona1 = new Persona("Juan", 16, "M", "123");
        Persona persona2 = new Persona("Maria", 35, "F", "456");
        Persona persona3 = new Persona("Pedro", 36, "M", "789");

        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);

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
        System.out.println("El producto con codigo " + codigoBuscar + " es " + empresa.buscarProducto(empresa.getProductos(), codigoBuscar).getNombre());


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

        // PUNTO 7
        List<Persona> listaFiltrada = new ArrayList<>();
        List<Persona> personasMayoresEdad = listMayoresEdad(personas, listaFiltrada, 0);
        System.out.println("Personas Mayores de Edad: "+ personasMayoresEdad);

        // PUNTO 8
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "MERA");
        mapa.put(2, "GGGG");
        mapa.put(3, "FFFF");
        mapa.put(4, "AYFKM");

        Map<Integer, String> mapaPar = new HashMap<>();
        Iterator<Map.Entry<Integer, String>> iterator = mapa.entrySet().iterator();
        Map<Integer, String> mapaFiltrado = mapClavesPares(mapa, mapaPar, iterator);
        System.out.println("Mapa con Key Par: "+ mapaFiltrado);
    }

    public static void agregarAPila(Stack<Object> stack, Object objeto){
        if(stack.peek().getClass().equals(objeto.getClass())){
            stack.add(objeto);
        }
        else{
            System.out.println("No se puede añadir el objeto");
        }
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

    public static Map<Integer, String> mapClavesPares(Map<Integer, String> mapa, Map<Integer, String> mapaPar, Iterator<Map.Entry<Integer, String>> iterator){
        if(!iterator.hasNext()){
            return mapaPar;
        }

        Map.Entry<Integer, String> siguiente = iterator.next();

        if(siguiente.getKey() % 2 == 0){
            mapaPar.put(siguiente.getKey(), siguiente.getValue());
        }

        return mapClavesPares(mapa, mapaPar, iterator);
    }
}

