package TGN1;

public class Empleados extends Persona{
    private double sueldo;

    public Empleados(String nombre, int edad) {
        super(nombre, edad);
    }

    public Empleados(String nombre, int edad, double sueldo) {
        super(nombre, edad);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String getTipo() {
        return getClass().getName();
    }

    @Override
    public String toString() {
        return "\nnombre: " + getNombre() +
                "\nedad: " + getEdad();
    }
}
