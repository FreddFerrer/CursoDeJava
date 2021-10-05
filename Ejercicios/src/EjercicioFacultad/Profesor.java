package EjercicioFacultad;

public class Profesor extends Persona{

    private double sueldoBasico;
    private int antiguedad;


    public Profesor(String nombre, String apellido, int legajo, double sueldoBasico, int antiguedad) {
        super(nombre, apellido, legajo);
        this.sueldoBasico = sueldoBasico;
        this.antiguedad = antiguedad;
    }

    @Override
    public void modificarDatos() {
    }



    public double calcularSueldo(){
        double sueldo = this.antiguedad * this.sueldoBasico;
        return sueldo;
    }
}
