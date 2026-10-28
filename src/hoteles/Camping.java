package hoteles;

public class Camping extends Alojamiento{
    private int numeroCaravanas;
    private int capacidadeCaravanas;
    private boolean tienePiscina;


    public Camping(String nombre, double precioPorNoche, String ciudad, int numeroCaravanas, int capacidadeCaravanas, boolean tienePiscina) {
        super(nombre, precioPorNoche, ciudad);
        this.numeroCaravanas = numeroCaravanas;
        this.capacidadeCaravanas = capacidadeCaravanas;
        this.tienePiscina = tienePiscina;
    }

    public Camping(int numeroCaravanas, int capacidadeCaravanas, boolean tienePiscina) {
        this.numeroCaravanas = numeroCaravanas;
        this.capacidadeCaravanas = capacidadeCaravanas;
        this.tienePiscina = tienePiscina;
    }

    public Camping() {
    }

    public int getNumeroCaravanas() {
        return numeroCaravanas;
    }

    public void setNumeroCaravanas(int numeroCaravanas) {
        this.numeroCaravanas = numeroCaravanas;
    }

    public int getCapacidadeCaravanas() {
        return capacidadeCaravanas;
    }

    public void setCapacidadeCaravanas(int capacidadeCaravanas) {
        this.capacidadeCaravanas = capacidadeCaravanas;
    }

    public boolean isTienePiscina() {
        return tienePiscina;
    }

    public void setTienePiscina(boolean tienePiscina) {
        this.tienePiscina = tienePiscina;
    }

    public int getCapacidadeRestante(){
        return this.capacidadeCaravanas - this.numeroCaravanas;
    }

    public String toString(){
            return getNombre() + ", en " + getCiudad() + " (camping con capacidad para " +
                    this.capacidadeCaravanas + " caravanas)";
    }

}
