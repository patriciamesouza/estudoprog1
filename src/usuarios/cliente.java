package usuarios;

import vehiculos.Vehiculo;

public class cliente extends usuario {

    private Vehiculo vehiculo;
    private int numSocio;

    public cliente(String nombreUsuario, String contrasenya, int id, int anyoNacimiento, Vehiculo vehiculo, int numSocio) {
        super(nombreUsuario, contrasenya, id, anyoNacimiento);
        this.vehiculo = vehiculo;
        this.numSocio = numSocio;
    }

    public cliente() {
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    /* en eso metodo tambien tuve dificuldad pues no sabia nada de if
    if es como un se, asi que, si no hay vehiculo o sea, null,  el sistema devuelve 0.0
     */

    public double calcularPrecio(int numVehiculos, int dias) {
        if (this.vehiculo == null) {
            return 0.0;
        }
        return this.vehiculo.getPrecioPorDia() * numVehiculos * dias;
    }
    public String toString(){
        return this.getNombreUsuario() + " (" + this.getId() + ")";
    }
}