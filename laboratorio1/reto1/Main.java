import java.util.List;

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
                        5
                )
        );

        String mensaje = MensajeBienvenida.generarMensaje(estudiantes);
        System.out.println(mensaje);
    }
}