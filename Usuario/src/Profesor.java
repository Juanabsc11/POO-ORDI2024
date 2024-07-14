public class Profesor extends Usuario {
    private String materia;
    private int faltasAlumno;

    public Profesor(String nombre, String correoElectronico, String materia) {
        super(nombre, correoElectronico);
        this.materia = materia;
        this.faltasAlumno = 0;
    }

    public void faltasDeAlumno(Alumno alumno) {
        System.out.println(alumno.getNombre() + " tiene " + alumno.getNumeroDeFaltas() + " faltas.");
    }

    public void asignarTarea() {
        System.out.println("Tiene que hacer un resumen de la Primera Guerra Mundial.");
    }

    // Getters and Setters
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
