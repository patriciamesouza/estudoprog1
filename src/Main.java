public class Main {
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Messito",10, 2005);
        Jugador j2 = new Jugador("Ronaldo", 9, 2001);
        Jugador j3 = new Jugador("Pizarrito", 8, 2014);
        Equipo e = new Equipo("CEI FC", 2026, j1, j2, j3);
        System.out.println(e);
        System.out.println(e.getAnyoCentenario());
        e.getDetalles();
 }

}