import java.util.Arrays;
import java.util.List;

public class CarreraParalela {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int maximo = obtenerMaximo(numeros);
        int minimo = obtenerMinimo(numeros);
        int cantidad = obtenerCantidad(numeros);

        System.out.println("Número máximo: " + maximo);
        System.out.println("Número mínimo: " + minimo);
        System.out.println("Cantidad de números: " + cantidad);
    }

    /***
     * clase para poder calcular el numero mas grande de un listado de numeros
     * @param args lista de numeros
     * @return el numero mas grande de la lista
     */
    public static int obtenerMaximo(List<Integer> numeros) {
        return numeros.stream()
                .max(Integer::compareTo)
                .orElse(0);
    }

    /**
     * Calcula el número más pequeño de una lista de enteros.
     * @param numeros lista de números enteros
     * @return el número más pequeño de la lista, o 0 si la lista está
     */
    public static int obtenerMinimo(List<Integer> numeros) {
        return numeros.stream()
                .min(Integer::compareTo)
                .orElse(0);
    }

    /**
     * obtiene la cantidad de numeros de una lista
     * @param numeros lista de numeros
     * @return cantidad de numeros en la lista
     */
    public static int obtenerCantidad(List<Integer> numeros) {
        return numeros.size();
    }
}