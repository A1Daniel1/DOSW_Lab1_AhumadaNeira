
import java.util.Map;

public class Reto6 {
    public static void ejecutarComando(String comando) {
        switch (comando) {
            case "SALUDAR":
                Runnable saludo = () -> System.out.println("¡Saludos, viajero del tiempo y del código!");
                saludo.run();
                break;
            case "DESPEDIR":
                Runnable despedida = () -> System.out.println("Que los bits te acompañen, hasta la próxima misión");
                despedida.run();
                break;
            case "CANTAR":
                Runnable canto = () -> System.out.println("01010101");
                canto.run();
                break;
            case "DANZAR":
                Runnable baile = () -> System.out.println("Girando en modo fiesta");
                baile.run();
                break;
            default:
                System.out.println("Comando no reconocido");
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        ejecutarComando("SALUDAR");
    }
}