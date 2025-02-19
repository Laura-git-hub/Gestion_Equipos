package Herramientas;

import java.util.Scanner;

public class Utilidades {
    static Scanner scanner = new Scanner(System.in);

    public static String leerString(String dato) {
        System.out.println(dato);
        String respuesta = scanner.nextLine();
        return respuesta;
    }

    public static Float leerFloat(String dato) {
        System.out.println(dato);
        String respuesta = scanner.nextLine();
        Float respuestaFloat = Float.parseFloat(respuesta);
        return respuestaFloat;
    }

    public static Integer leerInteger(String dato) {
        while (true) {
            try {
                System.out.println(dato);
                String resp = scanner.nextLine();
                Integer respuestaInteger = Integer.parseInt(resp);
                return respuestaInteger;

            } catch (Exception e) {
                System.out.println("Valor introducido no válido");
            }
        }
    }

    public static int leerEntero(String dato) {
        while (true) {
            try {
                System.out.println("Dar " + dato);
                String datoLeido = scanner.nextLine();
                int numeroLeido = Integer.parseInt(datoLeido);
                return numeroLeido;
            } catch (Exception e) {
                System.out.println("Valor erroneo");
            }
        }
    }

}
