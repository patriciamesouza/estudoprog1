public class Curso {
    // 1. Atributos
    private String nombre;
    private int anyo; // Representa 1º o 2º
    private Alumno alumno;
    private Profesor profesor;

    // 2. Constructor Completo
    public Curso(String nombre, int anyo, Alumno alumno, Profesor profesor) {
        this.nombre = nombre;
        this.anyo = anyo;
        this.alumno = alumno;
        this.profesor = profesor;
    }

    // 3. Constructor Vacío
    public Curso() {
    }

    // 4. Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    // 5. Método toString con el formato solicitado
    @Override
    public String toString() {
        return this.nombre +
                " - Alumno: " + this.alumno.getNombre() +
                " - Profesor: " + this.profesor.getNombre() +
                " - Media: " + this.alumno.getMedia();
    }
}