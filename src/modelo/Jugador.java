package modelo;

public class Jugador extends Persona {
    private int dorsal;
    private float altura;
    private float peso;
    private int idJugador;
    private Equipo equipo;

    public Jugador(String nombre, String apellido, int dorsal) {
        super(nombre, apellido);
        this.dorsal = dorsal;
        equipo = null;

    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public Jugador(String nombre, String apellido, float altura, float peso, int idJugador) {
        super(nombre, apellido);
        this.altura = altura;
        this.peso = peso;
        this.idJugador = idJugador;

    }

    public float getAltura() {
        return altura;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void escribirDatos() {
        super.escribirDatos();
        System.out.println("Dorsal: " + dorsal);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
    }

}
