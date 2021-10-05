package EjercicioFacultad;

public class Estudiante extends Persona{

    private String nombre;
    private int legajo;

    public Estudiante(String nombre, String apellido, int legajo, String nombre1, int legajo1) {
        super(nombre, apellido, legajo);
        this.nombre = nombre1;
        this.legajo = legajo1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @Override
    public void modificarDatos() {

    }
}
