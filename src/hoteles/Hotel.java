package hoteles;

public class Hotel extends Alojamiento{
    private int estrellas;
    private boolean desayunoIncluido;

    public Hotel(String nombre, double precioPorNoche, String ciudad, int estrellas, boolean desayunoIncluido) {
        super(nombre, precioPorNoche, ciudad);
        this.estrellas = estrellas;
        this.desayunoIncluido = desayunoIncluido;
    }

    public Hotel(int estrellas, boolean desayunoIncluido) {
        this.estrellas = estrellas;
        this.desayunoIncluido = desayunoIncluido;
    }

    public Hotel(int estrellas) {
        this.estrellas = estrellas;
    }

    public Hotel() {
    }

    //desayuno si o no?//
    public Hotel(String nombre, double precioPorNoche, String ciudad, boolean desayunoIncluido) {
        super(nombre, precioPorNoche, ciudad);
        this.desayunoIncluido = false;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public boolean isDesayunoIncluido() {
        return desayunoIncluido;
    }

    public void setDesayunoIncluido(boolean desayunoIncluido) {
        this.desayunoIncluido = desayunoIncluido;
    }

    public String toString() {
        return this.getNombre() + ", en " + this.getCiudad() + " (hotel de " + this.estrellas + " estrellas)";
    }
}
