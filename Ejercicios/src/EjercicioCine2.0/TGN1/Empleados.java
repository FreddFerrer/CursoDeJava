package TGN1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empleados extends Persona{
    private double sueldo;
    static ArrayList<Empleados> empleados = new ArrayList<>();

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

    public static ArrayList<Empleados> getEmpleados(){
        empleados = new ArrayList<>();
        return empleados;
    }


    @Override
    public String getTipo() {
        return getClass().getName();
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() +
                "\nEdad: " + getEdad() + "\n";
    }

    public static Empleados crearEmpleado(){

        String nombreCompleto;
        int edad;
        double sueldo;

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n\n*****CREANDO EMPLEADO*****");
        try{
            System.out.print("Ingrese el nombre y apellido del empleado: ");
            nombreCompleto = entrada.nextLine();

            System.out.print("\nIngrese la edad: ");
            edad = entrada.nextInt();

            System.out.print("\nIngrese el sueldo: ");
            sueldo = entrada.nextDouble();

            Empleados empleadoCreado = new Empleados(nombreCompleto, edad, sueldo);

            empleados.add(empleadoCreado);

            System.out.println(empleadoCreado);

            System.out.println(empleados.size());
        } catch (Exception e) {
            String error = "Error al cargar los datos. " + e;
            System.out.println(error);
            return null;
        }

        System.out.println("Empleado creado con exito!");
        System.out.println("Actualmente hay " + empleados.size() + " empleados creados.");

        return new Empleados(nombreCompleto, edad);
    }

    public static void mostrarEmpleados(List<Empleados> listaEmpleados) {
        System.out.println("\nLista de empleados:");

        if (listaEmpleados.size() == 0)
            System.out.println("No hay empleados cargados.");
        else {
            for (Empleados empleados : listaEmpleados) {
                empleados.getNombre();
                System.out.println(empleados);
            }
        }
    }
}

