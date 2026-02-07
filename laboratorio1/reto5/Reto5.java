import java.util.*;
import java.util.stream.Collectors;

public class Reto5 {
    
    public static HashSet<Integer> crearEquipoHashSet() {
        return new HashSet<>(Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5));
    }
    
    public static TreeSet<Integer> crearEquipoTreeSet() {
        return new TreeSet<>(Arrays.asList(12, 3, 25, 10, 7, 30, 18, 4));
    }
    
    public static Set<Integer> eliminarMultiplosDe3(Set<Integer> numeros) {
        return numeros.stream()
            .filter(n -> n % 3 != 0)
            .collect(Collectors.toSet());
    }
    
    public static Set<Integer> eliminarMultiplosDe5(Set<Integer> numeros) {
        return numeros.stream()
            .filter(n -> n % 5 != 0)
            .collect(Collectors.toSet());
    }
    
    public static void main(String[] args) {
        HashSet<Integer> equipoHash = crearEquipoHashSet();
        TreeSet<Integer> equipoTree = crearEquipoTreeSet();
        
        Set<Integer> filtrado1 = eliminarMultiplosDe3(equipoHash);
        Set<Integer> filtrado2 = eliminarMultiplosDe5(equipoTree);
        
        System.out.println("HashSet sin múltiplos de 3: " + filtrado1);
        System.out.println("TreeSet sin múltiplos de 5: " + filtrado2);
    }
}