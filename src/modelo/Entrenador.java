package modelo;

public class Entrenador extends Persona {

    private int anioLicencia;

    public Entrenador(String nombre, String apellido, int anioLicencia) {
        super(nombre, apellido);
        this.anioLicencia = anioLicencia;

    }

    public int getAnioLicencia() {
        return anioLicencia;
    }

    public void escribirDatos() {
        super.escribirDatos();
        System.out.println("Año Licencia: " + anioLicencia);

    }
}
