
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
            case "BROMEAR": 
                Runnable broma = () -> System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio…");
                broma.run();
                break;
            case "GRITAR": 
                Runnable grito = () -> System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!");
                grito.run();
                break;
            case "SUSURRAR": 
                Runnable susurro = () -> System.out.println("La máquina susurra: Shhh… los bugs están dormidos");
                susurro.run();
                break;
            case "ANALIZAR": 
                Runnable analisis = () -> System.out.println("La máquina procesa: Analizando datos… resultado: ¡Eres increíble programando!");
                analisis.run();
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