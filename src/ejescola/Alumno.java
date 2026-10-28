package ejescola;

public class Alumno {
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;
    private double nota3;

    // Constructor 1: Completo
    public Alumno(String nombre, String apellido, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // Constructor 2: ¡EL QUE FALTABA! (Pone las notas a 0.0 automáticamente)
    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota1 = 0.0;
        this.nota2 = 0.0;
        this.nota3 = 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia(){
        return (nota1 + nota2 + nota3) / 3.0;
    }

    public boolean getAprobado() {
        return getMedia() >= 5;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.getApellido() + " ha aprobado: " + this.getAprobado();
    }
}