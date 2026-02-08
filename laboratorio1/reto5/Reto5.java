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

    public static TreeSet<Integer> unirEnArena(Set<Integer> set1, Set<Integer> set2) {
        TreeSet<Integer> arena = new TreeSet<>();
        arena.addAll(set1);
        arena.addAll(set2);
        return arena;
    }
    
    public static void main(String[] args) {
        HashSet<Integer> equipoHash = crearEquipoHashSet();
        TreeSet<Integer> equipoTree = crearEquipoTreeSet();
    
        Set<Integer> filtrado1 = eliminarMultiplosDe3(equipoHash);
        Set<Integer> filtrado2 = eliminarMultiplosDe5(equipoTree);
    
        TreeSet<Integer> arena = unirEnArena(filtrado1, filtrado2);
    
        arena.forEach(num -> System.out.println("Número en arena: " + num));
    }
}