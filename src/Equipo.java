public class Equipo {
    private String nombre;
    private int anyoFundacion;
    // Estos atributos son objetos de la clase Jugador
    private Jugador jugador1;
    private Jugador jugador2;
    private Jugador jugador3;

    // CORREGIDO: Los parámetros deben ser de tipo 'Jugador', no 'String'
    public Equipo(String nombre, int anyoFundacion, Jugador jugador1, Jugador jugador2, Jugador jugador3) {
        this.nombre = nombre;
        this.anyoFundacion = anyoFundacion;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.jugador3 = jugador3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnyoFundacion() {
        return anyoFundacion;
    }

    public void setAnyoFundacion(int anyoFundacion) {
        this.anyoFundacion = anyoFundacion;
    }

    // CORREGIDO: Cambiado String por Jugador
    public Jugador getJugador1() {
        return jugador1;
    }

    // CORREGIDO: Cambiado String por Jugador
    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    // CORREGIDO: Cambiado String por Jugador
    public Jugador getJugador2() {
        return jugador2;
    }

    // CORREGIDO: Cambiado String por Jugador
    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    // CORREGIDO: Cambiado String por Jugador
    public Jugador getJugador3() {
        return jugador3;
    }

    // CORREGIDO: Cambiado String por Jugador
    public void setJugador3(Jugador jugador3) {
        this.jugador3 = jugador3;
    }

    public int getAnyoCentenario(){
        return this.anyoFundacion + 100;
    }

    public void getDetalles() {
        System.out.println("El equipo " + this.nombre + " tiene los siguientes jugadores:");
        System.out.println("- " + this.jugador1.getNombre() + ", con dorsal " + this.jugador1.getDorsal() + " y " + this.jugador1.getExperiencia() + " años de experiencia");
        System.out.println("- " + this.jugador2.getNombre() + ", con dorsal " + this.jugador2.getDorsal() + " y " + this.jugador2.getExperiencia() + " años de experiencia");
        System.out.println("- " + this.jugador3.getNombre() + ", con dorsal " + this.jugador3.getDorsal() + " y " + this.jugador3.getExperiencia() + " años de experiencia");
    }
    @Override
    public String toString() {
        return this.nombre + ", fundado en " + this.anyoFundacion;
    }
}
