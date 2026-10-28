public class CuentaBancaria {
    private String titular;
    private String nombreBanco;
    private double saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String titular, String nombreBanco) {
        this.titular = titular;
        this.nombreBanco = nombreBanco;
        this.saldo = 100.0;
    }

    public CuentaBancaria(String titular, String nombreBanco, double saldo) {
        this.titular = titular;
        this.nombreBanco = nombreBanco;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void retirar(double cantidad){
        this.saldo -= cantidad;
}
    public void depositar(double cantidad){
    this.saldo += cantidad;
    }
//    public String toString(){
//    return "saldo de " + this.titular + " (" + this.nombreBanco + ")" + this.saldo + "€";
//    }
}
