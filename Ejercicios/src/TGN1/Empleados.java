package TGN1;

public class Empleados extends Persona{
    private double sueldo;

    public Empleados(String nombre, int edad) {
        super(nombre, edad);
    }


    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public void rolPersona() {

    }

    @Override
    public void datosPersona() {

    }
}
