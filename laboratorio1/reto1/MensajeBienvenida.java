import java.util.stream.Collectors;
import java.util.List;

public class MensajeBienvenida {
    public static String generarMensaje(List<Estudiante> estudiantes) {
        String mensaje = estudiantes.stream()
                .map(est -> est.getNombre() + ", estudiante de la escuela de " +
                        est.getSemestre() + ".° semestre de " + est.getEdad() + " años")
                .collect(Collectors.joining(" y "));

        String correos = estudiantes.stream()
                .map(Estudiante::getCorreo)
                .collect(Collectors.joining(" y "));

        return "¡Hola, bienvenidos! Nosotros somos la pareja conformada por " +
                mensaje + ". Nuestros correos institucionales son " + correos + ".";
    }
}