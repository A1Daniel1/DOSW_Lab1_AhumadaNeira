import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
public class reto4 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("oro", 5);
        hashMap.put("plata", 3);
        hashMap.put("oro", 7);
        hashMap.put("diamante", 10);

        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("plata", 8);
        hashtable.put("rubí", 4);
        hashtable.put("oro", 12);
        hashtable.put("esmeralda", 6);

        reto4 reto = new reto4();
        reto.combinarMapas(hashMap, hashtable);
    }

    public void combinarMapas(HashMap<String, Integer> hashMap, Hashtable<String, Integer> hashtable) {
        HashMap<String, Integer> resultado = new HashMap<>();

        for (Map.Entry<String, Integer> entrada : hashMap.entrySet()) {
            String claveMayuscula = entrada.getKey().toUpperCase();
            resultado.put(claveMayuscula, entrada.getValue());
        }

        for (Map.Entry<String, Integer> entrada : hashtable.entrySet()) {
            String claveMayuscula = entrada.getKey().toUpperCase();
            resultado.put(claveMayuscula, entrada.getValue());
        }

        System.out.println(resultado);
    }

    public void almacenarHashMap(String metal, Integer valor) {
        HashMap<String, Integer> metales = new HashMap<String, Integer>();

        metales.putIfAbsent("oro", 4);
        metales.putIfAbsent("plata", 3);
        metales.putIfAbsent("oro", 7);
        metales.putIfAbsent("diamante", 10);

        System.out.println(metales);
    }

    public static Hashtable<String, Integer> crearMapa(List<Map.Entry<String, Integer>> datos) {

        Hashtable<String, Integer> tabla = new Hashtable<>();

        for (Map.Entry<String, Integer> entrada : datos) {
            tabla.putIfAbsent(entrada.getKey(), entrada.getValue());
        }

        return tabla;
    }
}