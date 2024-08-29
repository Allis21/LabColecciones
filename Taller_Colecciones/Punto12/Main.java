package Taller_Colecciones.Punto12;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        Nodo raiz = new Nodo(5);
        raiz.izquierdo = new Nodo(3);
        raiz.derecho = new Nodo(7);
        raiz.izquierdo.izquierdo = new Nodo(2);
        raiz.izquierdo.derecho = new Nodo(4);
        raiz.derecho.derecho = new Nodo(8);

        // Obtener los elementos en orden ascendente
        List<Integer> resultado = recorridoInOrder(raiz);
        System.out.println(resultado);
    }

    public static List<Integer> recorridoInOrder(Nodo nodo) {
        List<Integer> lista = new ArrayList<>();
        recorridoInOrderRecursivo(nodo, lista);
        return lista;
    }

    private static void recorridoInOrderRecursivo(Nodo nodo, List<Integer> lista) {
        if (nodo == null) {
            return;
        }

        // Recorre el subárbol izquierdo
        recorridoInOrderRecursivo(nodo.izquierdo, lista);

        // Visita la raíz
        lista.add(nodo.valor);

        // Recorre el subárbol derecho
        recorridoInOrderRecursivo(nodo.derecho, lista);
    }
}