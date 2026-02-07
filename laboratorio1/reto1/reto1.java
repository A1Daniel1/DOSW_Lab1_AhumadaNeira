import java.util.List;
import java.util.stream.Collectors;

public class Estudiante {
    private String nombre;
    private int edad;
    private String correo;
    private int semestre;

    public Estudiante(String nombre, int edad, String correo, int semestre) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public int getSemestre() {
        return semestre;
    }
}

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

public class Main {
    public static void main(String[] args) {

        List<Estudiante> estudiantes = List.of(
                new Estudiante(
                        "Juan Neira",
                        21,
                        "juan.neira@mail.escuelaing.edu.co",
                        7
                ),
                new Estudiante(
                        "Daniel Ahumada",
                        21,
                        "daniel.ahumada@mail.escuelaing.edu.co",
                        6
                )
        );

        String mensaje = MensajeBienvenida.generarMensaje(estudiantes);
        System.out.println(mensaje);
    }
}