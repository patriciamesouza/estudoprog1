package usuarios;

public class usuario {
    private String nombreUsuario;
    private String contrasenya;
    private int id;
    private int anyoNacimento;

    public usuario(String nombreUsuario, String contrasenya, int id, int anyoNacimento) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenya = contrasenya;
        this.id = id;
        this.anyoNacimento = anyoNacimento;
    }

    public usuario() {
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnyoNacimento() {
        return anyoNacimento;
    }

    public void setAnyoNacimento(int anyoNacimento) {
        this.anyoNacimento = anyoNacimento;
    }

    public boolean esAdulto() {
        return anyoNacimento > 18;
    }

    /* aqui tuve dificuldad pero me parece q tengo q verificar si hay caracteres primero y despues
      verificar cuantos hay con .length*/

    public boolean contrasenyaSegura () {
            return this.contrasenya != null && this.contrasenya.length() > 10;
    }

        public String toString () {
            return this.nombreUsuario + " (" + this.id + ")";
        }

}
