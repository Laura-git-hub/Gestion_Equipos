package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Herramientas.Utilidades;

public class Equipo {
    public Entrenador getEntrenador() {
        return entrenador;
    }

    private String nombre;
    private String ciudad;
    private int idEquipo;
    private ArrayList<Jugador> plantilla;
    Entrenador entrenador;

    public Equipo(String nombre, String ciudad, int idEquipo) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.idEquipo = idEquipo;
        plantilla = new ArrayList<>();
        entrenador = null;

    }

    public String getNombre() {
        return nombre;
    }

    public Equipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public Jugador comprobarJugador(Jugador jugador) {
        for (Jugador jugadorDentro : plantilla) {
            if (jugadorDentro.getDorsal() == jugador.getDorsal()) {
                return jugadorDentro;
            }
        }
        return null;
    }

    public void altaJugador() {

        String nombre = Utilidades.leerString("NOMBRE JUGADOR: ");
        String apellido = Utilidades.leerString("APELLIDO JUGADOR: ");
        float altura = Utilidades.leerFloat("ALTURA DEL JUGADOR: ");
        float peso = Utilidades.leerFloat("PESO DEL JUGADOR: ");
        int idJugador = Utilidades.leerEntero("ID JUGADOR: ");
        Jugador jugador = new Jugador(nombre, apellido, altura, peso, idJugador);
        Jugador jugador1 = comprobarJugador(jugador);

        if (jugador1 != null) {
            System.out.println("El jugador no se puede dar de alta en el equipo porque ya existe.");
        } else {

            plantilla.add(jugador);
            // System.out.println("El jugador se ha dado de ALTA en el equipo.");
        }

    }

    public void bajaJugador() {
        String nombre = Utilidades.leerString("NOMBRE JUGADOR: ");
        String apellido = Utilidades.leerString("APELLIDO JUGADOR: ");
        float altura = Utilidades.leerFloat("ALTURA DEL JUGADOR: ");
        float peso = Utilidades.leerFloat("PESO DEL JUGADOR: ");
        int idJugador = Utilidades.leerEntero("ID JUGADOR: ");
        Jugador jugador = new Jugador(nombre, apellido, altura, peso, idJugador);
        Jugador jugador1 = comprobarJugador(jugador);

        if (jugador1 == null) {
            System.out.println("El jugador no se puede dar de BAJA en el equipo porque NO EXISTE.");
        } else {

            plantilla.remove(jugador);
            System.out.println("El jugador se ha dado de BAJA en el equipo.");
        }

    }

    public void datosJugadorMasAlto() {

        // COMPROBAR SI SON ORDDDENADOS DANDO LOS MAS ALTOS
        /*
         * if (plantilla.size() == 0) {
         * System.out.println("El equipo" + nombre + "no tiene jugadores inscritos");
         * } else {
         * Collections.sort(plantilla, Comparator.comparingDouble(jugador ->
         * jugador.getAltura()));
         * plantilla.get(plantilla.size()).escribirDatos();
         * }
         */

        // JUGADORES ORDENADOS DE MAS BAJO A MAS ES DECIR --LOS MAS BAJOS--

        if (plantilla.size() == 0) {
            System.out.println("El equipo" + nombre + "no tiene jugadores inscritos");
        } else {
            Collections.sort(plantilla, Comparator.comparingDouble(jugador -> jugador.getAltura()));
            plantilla.get(plantilla.size() - 1).escribirDatos();
        }
    }

}
