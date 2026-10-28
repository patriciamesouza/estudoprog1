package envios;

public class EnvioUrgente extends Envio {

    // Atributos
    private double recargo;

    // 1. Constructor Vacío
    public EnvioUrgente() {
        super();
    }

    // 2. Constructor Completo
    public EnvioUrgente(String codigo, String destino, double peso, double costeBase, double recargo) {
        super(codigo, destino, peso, costeBase); // Envía los datos comunes a la clase padre Envio
        this.recargo = recargo;
    }

    // Métodos: Getters y Setters
    public double getRecargo() {
        return recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }

    // Metodo para calcular el coste total (costeBase + recargo fijo)
    @Override
    public double getCosteTotal() {
        return this.getCosteBase() + this.recargo;
    }

    // Metodo toString modificado con el formato solicitado
    @Override
    public String toString() {
        return "Envío urgente " + this.getCodigo() + " con destino " + this.getDestino();
    }
}