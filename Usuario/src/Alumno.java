public class Alumno extends Usuario {
    private String numeroMatricula;
    private int numeroDeFaltas;

    public Alumno(String nombre, String correoElectronico, String numeroMatricula) {
        super(nombre, correoElectronico);
        this.numeroMatricula = numeroMatricula;
        this.numeroDeFaltas = 0;
    }

    public void incrementarFaltas() {
        this.numeroDeFaltas++;
    }

    public void promedioNota() {
        System.out.println("Cálculo del promedio de notas.");
    }

    // Getters and Setters
    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroDeFaltas() {
        return numeroDeFaltas;
    }

    public void setNumeroDeFaltas(int numeroDeFaltas) {
        this.numeroDeFaltas = numeroDeFaltas;
    }
}
