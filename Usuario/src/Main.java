public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Juan", "jarambulo.es@tecnologicoargos.edu.ec", "Poo");
        Alumno alumno = new Alumno("Sofia", "sofia123@gmail.com", "12345");

        profesor.mostrarInformacion();
        alumno.mostrarInformacion();

        alumno.incrementarFaltas();
        alumno.incrementarFaltas();

        profesor.faltasDeAlumno(alumno);
        profesor.asignarTarea();
    }
}
