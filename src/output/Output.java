package output;

import alumno.Alumno;

public class Output {

    public void mostrarMenu(){

        System.out.println("""
                Elija la acción que desea realizar
                1. Alta Estudiante
                2. Listar Estudiantes
                3. Actualizar Estudiante
                4. Eliminar Estudiante
                5. Salir
                """);
    }


    public void mostrarMensajeNombre(){

        System.out.println("Ingrese su nombre completo");
    }

    public void mostrarMensajeEdad(){

        System.out.println("Ingrese su edad");
    }
    public void mostrarMensajeFechaNac(){

        System.out.println("Ingrese su fecha de nacimiento");
    }

    public void mostrarMensajeAsignatura(){

        System.out.println("Ingrese nombre de asignatura");
    }

    public void mostrarMensajeNota(){

        System.out.println("Ingrese nota de asignatura");
    }

    public void listarAlumnos(Alumno alumno){

        System.out.println(" "+ alumno);
    }

    public void imprimirCabecera(String formato){

        System.out.printf(formato, "Nombre Alumno", "Edad", "Fecha", "Asignatura 1", "Nota", "Asignatura 2", "Nota");
    }

    public void imprimirAlumno(String formato, String nombre, int edad, String fecha, String asignatura1, double nota1,String asignatura2 , double nota2){

        System.out.printf(formato, nombre, edad, fecha, asignatura1, nota1, asignatura2, nota2);
    }

    public void imprimirLinea(){
        System.out.println("+-----------------+------+--------------+-----------------+------+-----------------+------+");

    }


}
