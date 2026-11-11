import vehiculos.*;
import usuarios.*;

public class Main {
    public static void main(String[] args) {

        Coche coche1 = new Coche("Uno", 5, 33.2, "Fiat", 180, Coche.Motor.GASOLINA);
        Coche coche2 = new Coche("Chevrolet", 5, 75.0, "Montana", Coche.Motor.DIESEL);

        Moto moto1 = new Moto("Ninja Pj2", 2, 18.9, "Kawasaki", 400);
        Moto moto2 = new Moto("Vespa", 2, 12.3, "Piaggio", 125);

        Patinete patinete1 = new Patinete("Mi Scooter 3", 1, 9.83, "Xiaomi", 8, true);
        Patinete patinete2 = new Patinete("E22", 1, 8.56, "Segway", 6, false);

        Furgoneta furgoneta1 = new Furgoneta("Transporter", 3, 60.0, "Volkswagen", 25.5);
        Furgoneta furgoneta2 = new Furgoneta("Partner", 2, 40.0, "Peugeot", 15.0);

        cliente cliente1 = new cliente("rosa52", "passSegura1234", 101, 1999, null, 5001);
        cliente cliente2 = new cliente("pedro_admin", "123", 102, 2012, null, 5002);


        administrador admin = new administrador("jefe_carlos", "adminSuper678", 1, 1985, administrador.Rol.JEFE);

        admin.asignarVehiculo(cliente1, coche1);

        System.out.println("Vehículo asignado a Rosa " + cliente1.getVehiculo());

        // para calcular el precio del alquiler del vehículo asignado para Rosa (1 vehículo durante 5 días)
        double precioAlquiler = cliente1.calcularPrecio(1, 5);
        System.out.println("Precio total alquiler para Rosa (5 días): " + precioAlquiler + " €");

    }
}