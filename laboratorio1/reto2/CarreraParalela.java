import java.util.Arrays;
import java.util.List;

public class CarreraParalela {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        CarreraParalela carrera = new CarreraParalela();
        carrera.calcularLista(numeros);
        boolean esPar = carrera.cantidadEsPar(numeros);
        System.out.println("La cantidad de números es par: " + esPar);
    }

    /***
     * metodo para analizar una lista de numeros y devolver un objeto Resultado
     * @param numeros lista de numeros
     * @return objeto Resultado con los datos calculados
     */
    public static Resultado analizar(List<Integer> numeros) {
        int max = obtenerMaximo(numeros);
        int min = obtenerMinimo(numeros);
        int cant = obtenerCantidad(numeros);
        
        Resultado resultado = new Resultado(max, min, cant);
        resultado.setMayorEsMultiploDe2(max % 2 == 0 ? true : false);
        resultado.setMayorEsDivisorDe2(2 % max == 0 ? true : false);

        resultado.setCantidadEsImpar(cant % 2 != 0 ? true : false);
        
        return resultado;
    }



    /***
     * metodo para calcular el maximo, minimo y cantidad de numeros en una lista
     * @param numeros lista de numeros
     */
    public void calcularLista(List<Integer> numeros) {
        List<Integer> resultado = Arrays.asList(
            obtenerMaximo(numeros),
            obtenerMinimo(numeros),
            obtenerCantidad(numeros));

        System.out.println("Resultados: " + resultado);
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

    /**
     * metodo para verificar si el numero mayor es par
     * @param numero numero a verificar
     * @return si es par o impar
     */

    public void esPar(int numero) {
        String resultado = (numero % 2 == 0) ? "Es par" : "Es impar";
        System.out.println(resultado);
    }

    /**
     * calcular si la cantidad de datos es par
     * @param numeros lista de numeros
     * @return si la cantidad es par
     */
    public boolean cantidadEsPar(List<Integer> numeros) {
        return obtenerCantidad(numeros) % 2 == 0;
    }

    
}