package hoteles;

public class Alojamiento {
    private String nombre;
    private double precioPorNoche;
    private String ciudad;

    public Alojamiento(String nombre, double precioPorNoche, String ciudad) {
        this.nombre = nombre;
        this.precioPorNoche = precioPorNoche;
        this.ciudad = ciudad;
    }

    public Alojamiento() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getCalcularPrecio(int noches) {
        return noches * this.precioPorNoche;
    }

    public String toString() {
        return this.nombre + ", en " + this.ciudad;
    }

}
