package EjercicioFacultad;

import java.util.Scanner;

public class Profesor extends Persona{

    private double sueldoBasico;
    private int antiguedad;


    public Profesor(String nombre, String apellido, int legajo, double sueldoBasico, int antiguedad) {
        super(nombre, apellido, legajo);
        this.sueldoBasico = sueldoBasico;
        this.antiguedad = antiguedad;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void modificarDatos() {
        Scanner s = new Scanner(System.in);

        System.out.println("Modificando datos de: " + this.toString());
        System.out.println("Ingresa el nombre:");
        String nombre = s.nextLine();
        this.setNombre(nombre);
        System.out.println("Ingresa el apellido:");
        String apellido = s.nextLine();
        this.setApellido(apellido);
        System.out.println("Ingresa el legajo:");
        int legajo = s.nextInt();
        this.setLegajo(legajo);
        System.out.println("Ingresa la antigüedad:");
        int antiguedad = s.nextInt();
        this.setAntiguedad(antiguedad);
        System.out.println("Ingresa el basico:");
        double basico = s.nextDouble();
        this.setSueldoBasico(basico);
        System.out.println("Datos actualizados!");
        System.out.println(this.toString());

        s.close();
    }


    public String toString() {
        String str = String.format("Profesor:\n" + super.toString() + "\t-> Básico: $%.2f\n" + "\t-> Antigüedad: %d años\n",
                this.sueldoBasico, this.antiguedad);
        return str;
        }

    public double calcularSueldo(){
        double sueldo = this.antiguedad * this.sueldoBasico;
        return sueldo;
    }

}
