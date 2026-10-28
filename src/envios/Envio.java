package envios;

public class Envio {
    private String codigo;
    private String destino;
    private double peso;
    private double costeBase;

    public Envio(String codigo, String destino, double peso, double costeBase) {
        this.codigo = codigo;
        this.destino = destino;
        this.peso = peso;
        this.costeBase = costeBase;
    }

    public Envio() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCosteBase() {
        return costeBase;
    }

    public void setCosteBase(double costeBase) {
        this.costeBase = costeBase;
    }

    public double getCosteTotal(){
        return this.costeBase;
    }
    public boolean esPesado(){
        return this.peso > 10;
    }
    public String toString(){
        return "Envio " + this.codigo + "Destino " + this.destino;
    }

}

