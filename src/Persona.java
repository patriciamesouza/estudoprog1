public class Persona {
    private String nombre;
    private int edad;
    private double peso;
    private String piel;
    private int telefono;
    private String correo;


    public Persona(String nombre, int edad, double peso, String piel, int telefono, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.piel = piel;
        this.telefono = telefono;
        this.correo = correo;
    }
    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPiel() {
        return piel;
    }

    public void setPiel(String piel) {
        this.piel = piel;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String toString() {
        return this.nombre + " (" + this.edad + "años)";
        }




}
