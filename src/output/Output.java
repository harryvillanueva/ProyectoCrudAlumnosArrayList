package output;

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


}
