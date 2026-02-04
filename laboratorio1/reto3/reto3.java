import java.util.function.Function;

public class Reto3 {

    public static String repetirTresVeces(String mensaje) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(mensaje);
            if (i < 2) sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Function<String, String> repetir = Reto3::repetirTresVeces;
        System.out.println(repetir.apply("pruebaxd"));
    }
}