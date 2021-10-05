package EjercicioFacultad;

public abstract class Persona {

    private String nombre;
    private String apellido;
    private int legajo;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    public abstract void modificarDatos();
}
