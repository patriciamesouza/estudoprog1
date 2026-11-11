package usuarios;

import vehiculos.Vehiculo;

public class administrador extends usuario {
    public enum Rol {JEFE, VENDEDOR};
    private Rol rol;


    public administrador() {
        super();
    }

    public administrador(String nombreUsuario, String contrasenya, int id, int anyoNacimiento, Rol rol) {
        super(nombreUsuario, contrasenya, id, anyoNacimiento);
        this.rol = rol;
    }

    public Rol getRol() { return rol; }
    public void setRol(Rol rol) { this.rol = rol; }


     // para asignar vehículo a uno objeto cliente//

    public void asignarVehiculo(cliente cliente, Vehiculo vehiculo) {
        if (cliente != null) {
            cliente.setVehiculo(vehiculo);
        }
    }

    public void retirarVehiculo(cliente cliente) {
        if (cliente != null) {
            cliente.setVehiculo(null);
        }
    }

    public String toString() {
        return "Administrador " + getNombreUsuario() + " (" + getId() + ")";
    }
}
