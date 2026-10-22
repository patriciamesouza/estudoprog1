public class Jugador {
    private String nombre;
    private int dorsal;
    private int anyoDebut;

    public Jugador(String nombre, int dorsal, int anyoDebut) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.anyoDebut = anyoDebut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getAnyoDebut() {
        return anyoDebut;
    }

    public void setAnyoDebut(int anyoDebut) {
        this.anyoDebut = anyoDebut;
    }

    public int getExperiencia(){
        return 2026 - this.anyoDebut;
    }

    @Override
    public String toString() {
        return this.nombre + " (" + this.dorsal + ")";
    }

}
