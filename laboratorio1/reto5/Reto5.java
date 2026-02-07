import java.util.HashSet;
import java.util.Set;
import java.util.Random;

public class Reto5 {

    public static Set<Integer> generarHashSetSinMultiplosDeTres(int cantidad) {

        Set<Integer> numeros = new HashSet<>();
        Random random = new Random();

        while (numeros.size() < cantidad) {
            numeros.add(random.nextInt(50) + 1);
        }

        numeros.removeIf(n -> n % 3 == 0);

        return numeros;
    }
}