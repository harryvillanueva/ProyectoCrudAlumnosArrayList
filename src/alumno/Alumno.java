package alumno;

public class Alumno {

    String nombreCompleto;
    int edad;
    String fechaNac;
    String asignatura1;
    String asignatura2;
    double nostaAsignatura1;
    double notaAsignatura2;


    public Alumno() {

    }

    public Alumno(String nombreCompleto, int edad, String fechaNac, String asignatura1,double nostaAsignatura1, String asignatura2,  double notaAsignatura2) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.fechaNac = fechaNac;
        this.asignatura1 = asignatura1;
        this.nostaAsignatura1 = nostaAsignatura1;
        this.asignatura2 = asignatura2;
         this.notaAsignatura2 = notaAsignatura2;
    }


    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public String getAsignatura1() {
        return asignatura1;
    }

    public String getAsignatura2() {
        return asignatura2;
    }

    public double getNostaAsignatura1() {
        return nostaAsignatura1;
    }

    public double getNotaAsignatura2() {
        return notaAsignatura2;
    }

    @Override
    public String toString() {
        return
                 nombreCompleto + " "+
                 edad + " "+
                 fechaNac + " " +
                 asignatura1 + " " +
                 nostaAsignatura1 + " "+
                 asignatura2 + " " +
                notaAsignatura2
                ;
    }
}
