import java.util.List;
import java.util.Arrays;

public class CarreraParalela {
    /***
     * clase para poder calcular el numero mas grande de un listado de numeros
     */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(19, 2, 3, 4, 5, 34, 67);
        int maximo = numeros.stream()
                .max(Integer::compare)
                .get();
        System.out.println("Máximo: " + maximo);
    }
}