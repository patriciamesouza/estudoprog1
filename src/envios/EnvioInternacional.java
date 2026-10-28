package envios;

public class EnvioInternacional extends Envio{
    private double tasaAduanas;
    private String paisDestino;

    public EnvioInternacional(String codigo, String destino, double peso, double costeBase, double tasaAduanas, String paisDestino) {
        super(codigo, destino, peso, costeBase);
        this.tasaAduanas = tasaAduanas;
        this.paisDestino = paisDestino;
    }

    public EnvioInternacional() {
    }

    public double getTasaAduanas() {
        return tasaAduanas;
    }

    public void setTasaAduanas(double tasaAduanas) {
        this.tasaAduanas = tasaAduanas;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public double getCosteTotal(){
        return getCosteBase() + (this.getCosteBase() * (this.tasaAduanas /100.0));
    }
    public String toString(){
        return "Envio internacional " + this.getCodigo() + "con destino " + this.getPaisDestino();


    }
}
