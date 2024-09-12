import java.util.Scanner;

import modelo.Liga;

public class App {

    public static Liga liga = new Liga();

    public static void main(String[] args) throws Exception {
        Boolean salir = false;
        while (!salir) {
            salir = menuPrincipal();

        }
    }

    private static Boolean menuPrincipal() {
        Boolean salir = false;

        System.out.println("##############################");
        System.out.println("##### MENU PRINCIPAL #########");
        System.out.println("##############################");
        System.out.println("1 Alta Equipo");
        System.out.println("2 Baja Equipo");
        System.out.println("3 Alta Jugador");
        System.out.println("4 Baja Jugador");
        System.out.println("5 Alta Entrenador");
        System.out.println("6 Listar Jugadores Más Altos");
        System.out.println("7 Listar Entrenadores Ordenados");
        System.out.println("9 Salir");

        Scanner scanner = new Scanner(System.in);
        String opcion = scanner.nextLine();

        switch (opcion) {
            case "1":
                liga.altaEquipo();
                break;
            case "2":
                liga.bajaEquipo();
                break;
            case "3":
                liga.altaJugador();
                break;
            case "4":
                liga.bajaJugador();
                break;
            case "5":
                liga.altaEntrenador();
                break;
            case "6":
                liga.listarJugadores();
                break;
            case "7":
                liga.listarEntrenadores();
                break;
            case "9":
                System.out.println("Saliendo...");
                salir = true;

                break;

            default:
                break;
        }
        return salir;

    }
}
