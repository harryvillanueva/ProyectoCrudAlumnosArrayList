package alumno;

import input.Input;
import output.Output;

import java.util.ArrayList;
import java.util.List;

public class AdministrarAlumnos {

    public static List<Alumno> listaAlumnos;
    public static Output output ;
    public static Input input ;

    public AdministrarAlumnos() {
        listaAlumnos = new ArrayList();
        output = new Output();
        input = new Input();

    }

    public static void agregarAlumno(){
        output.mostrarMensajeNombre();
        String nombre = input.getPalabra();
        output.mostrarMensajeEdad();
        int edad = input.getInt();
        output.mostrarMensajeFechaNac();
        String fechaNac = input.getPalabra();
        output.mostrarMensajeAsignatura();
        String asignatura1 = input.getPalabra();
        output.mostrarMensajeNota();
        double nota1 = input.getDouble();
        output.mostrarMensajeAsignatura();
        String asignatura2 = input.getPalabra();
        output.mostrarMensajeNota();
        double nota2 = input.getDouble();

        listaAlumnos.add(new Alumno(nombre,edad,fechaNac,asignatura1,nota1,asignatura2,nota2));


    }
}
