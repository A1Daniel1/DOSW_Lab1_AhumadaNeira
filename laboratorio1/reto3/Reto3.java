
import java.util.function.Function;

public class Reto3 {
    public static String eco(String cadena) {
        StringBuilder cadenaRevertida = new StringBuilder();
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaRevertida.append(cadena.charAt(i));
        }
        return cadenaRevertida.toString();
    }   

    public static void main(String[] args) {
        Function<String, String> revertir = Reto3::eco;
        System.out.println(revertir.apply("Hola Mundo")); 
    }
}