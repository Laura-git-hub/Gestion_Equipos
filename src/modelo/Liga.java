package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Herramientas.Utilidades;

public class Liga {

    private ArrayList<Equipo> equipos = new ArrayList<>();

    private Equipo crearEquipo() {
        String nombre = Utilidades.leerString("NOMBRE EQUIPO: ");
        String ciudad = Utilidades.leerString("CIUDAD EQUIPO: ");
        int idEquipo = Utilidades.leerEntero("ID EQUIPO: ");

        Equipo equipo = new Equipo(nombre, ciudad, idEquipo);
        return equipo;
    }

    private Equipo comprobarEquipo(Equipo equipo) {
        for (Equipo equipoDentro : equipos) {
            if (equipoDentro.getIdEquipo() == equipo.getIdEquipo()) {
                return equipoDentro;

            }
        }
        return null;
    }

    public void altaEquipo() {
        Equipo equipo = crearEquipo();
        Equipo equipoDentro = comprobarEquipo(equipo);

        if (equipoDentro != null) {
            System.out.println("El equipo no se puede dar de ALTA, ya existe");
        } else {
            equipos.add(equipo);
            System.out.println("El equipo se ha dado de ALTA correctamente");
        }
    }

    public void bajaEquipo() {
        Equipo equipo = crearEquipo();
        Equipo equipoDentro = comprobarEquipo(equipo);

        if (equipoDentro == null) {
            System.out.println("El equipo no se puede dar de BAJA, ya que no existe");
        } else {
            equipos.remove(equipoDentro);
            System.out.println("El equipo se ha dado de BAJA correctamente");
        }
    }

    public void altaJugador() {
        Equipo equipo = crearEquipo();
        Equipo equipoDentro = comprobarEquipo(equipo);

        if (equipoDentro == null) {
            System.out.println("El equipo no está dado de alta");
        } else {
            equipoDentro.altaJugador();

        }

    }

    public void bajaJugador() {
        Equipo equipo = crearEquipo();
        Equipo equipoDentro = comprobarEquipo(equipo);

        if (equipoDentro != null) {
            equipoDentro.bajaJugador();
        } else {
            System.out.println("El equipo no existe, no se puede dar de baja a un jugador.");

        }

    }

    public void listarJugadores() {
        for (Equipo equipo : equipos) {
            equipo.datosJugadorMasAlto();
        }
    }

    public void altaEntrenador() {
        System.out.println("ALTA DEL ENTRENADOR");
        String nombre = Utilidades.leerString("Nombre del Entrenador: ");
        String apellido = Utilidades.leerString("Apellido del Entrenador: ");
        int anioLicencia = Utilidades.leerEntero("Año de Licencia: ");

        Entrenador entrenador = new Entrenador(nombre, apellido, anioLicencia);

    }

    public void listarEntrenadores() {
        ArrayList<Entrenador> entrenadores = new ArrayList<>();

        for (Equipo equipo : equipos) {
            entrenadores.add(equipo.getEntrenador());
        }
        Collections.sort(entrenadores, Comparator.comparingInt(entrenador -> entrenador.getAnioLicencia()));
        for (Entrenador entrenador : entrenadores) {
            entrenador.escribirDatos();
            ;
        }
    }

}
