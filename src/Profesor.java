public class Profesor {
    // 1. Atributos
    private String nombre;
    private String modulo;
    private int anyoIncorporacion;

    // 2. Constructor Completo
    public Profesor(String nombre, String modulo, int anyoIncorporacion) {
        this.nombre = nombre;
        this.modulo = modulo;
        this.anyoIncorporacion = anyoIncorporacion;
    }

    // 3. Constructor con nombre y anyoIncorporacion (módulo por defecto a "Programación")
    public Profesor(String nombre, int anyoIncorporacion) {
        this.nombre = nombre;
        this.anyoIncorporacion = anyoIncorporacion;
        this.modulo = "Programación";
    }

    // 4. Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public int getAnyoIncorporacion() {
        return anyoIncorporacion;
    }

    public void setAnyoIncorporacion(int anyoIncorporacion) {
        this.anyoIncorporacion = anyoIncorporacion;
    }

    // 5. Métodos específicos
    // Devuelve el número de años trabajados asumiendo el año actual 2026
    public int getAnyos() {
        return 2026 - this.anyoIncorporacion;
    }

    // Metodo toString con el formato solicitado
    public String toString() {
        return this.nombre + ", profesor de " + this.modulo;
    }
}
