import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Reto4 {

    public static Hashtable<String, Integer> crearMapa(List<Map.Entry<String, Integer>> datos) {

        Hashtable<String, Integer> tabla = new Hashtable<>();

        for (Map.Entry<String, Integer> entrada : datos) {
            tabla.putIfAbsent(entrada.getKey(), entrada.getValue());
        }

        return tabla;
    }
}
