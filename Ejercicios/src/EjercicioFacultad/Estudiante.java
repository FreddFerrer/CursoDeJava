package EjercicioFacultad;

import java.util.Scanner;

public class Estudiante extends Persona{

    public Estudiante(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }

    @Override
    public void modificarDatos() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Modificiar los datos de " + this.toString());
        System.out.println("Ingrese el nombre: ");
        String nombre = ValidacionDeDatos.ingresarSoloLetras(entrada);
        this.setNombre(nombre);
        System.out.println("Ingrese el apellido: ");
        String apellido = ValidacionDeDatos.ingresarSoloLetras(entrada);
        this.setApellido(apellido);
        System.out.println("Ingrese el legajo: ");
        int legajo = ValidacionDeDatos.ingresarLegajo(entrada);
        this.setLegajo(legajo);
        System.out.println("Datos actualizados!");
        System.out.println(this.toString());
    }



    public String toString() {
        return "Estudiante: " + super.toString();
    }
}
