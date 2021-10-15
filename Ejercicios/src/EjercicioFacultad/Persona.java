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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public abstract void modificarDatos();

    public String toString() {
        String str = String.format("\t-> Nombre completo: %s, %s\n" + "\t-> Legajo: %d\n", this.apellido.toUpperCase(),
                this.nombre, this.legajo);
        return str;
    }
}
