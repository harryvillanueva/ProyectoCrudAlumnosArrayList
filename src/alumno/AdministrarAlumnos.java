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

    public static List<Alumno> getListaAlumnos() {
        return listaAlumnos;
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




    public static void listarAlumnos() {

        String formato = "| %-15s | %-4s | %-12s | %-15s | %-4s | %-15s | %-4s |\n";


        output.imprimirLinea();
        output.imprimirCabecera(formato);
        output.imprimirLinea();


        for (Alumno alumno : listaAlumnos) {

            output.imprimirAlumno(formato, alumno.getNombreCompleto(), alumno.getEdad(), alumno.getFechaNac(), alumno.getAsignatura1(), alumno.getNostaAsignatura1(), alumno.getAsignatura2(), alumno.getNotaAsignatura2());
        }

        output.imprimirLinea();
    }


   }

