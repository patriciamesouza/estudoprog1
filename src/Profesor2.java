public class Profesor2 extends Persona {
    private String codigo;
    private String modulo;
    private double salario;

    // O nome deve ser igual ao da classe (Profesor2) e corrigido o fecho com {
    public Profesor2(String nombre, int edad, double peso, String piel, int telefono, String correo, String codigo, String modulo, double salario) {
        super(nombre, edad, peso, piel, telefono, correo); // Chama o construtor da classe pai (Persona)
        this.codigo = codigo;
        this.modulo = modulo;
        this.salario = salario;
    } // <-- Faltava fechar o construtor

    // Getters e Setters (Boa prática adicionar para as novas variáveis)
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String toString(){
        return "ejescola.Profesor" + this.getNombre();
    }
}