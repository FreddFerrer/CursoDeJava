package TGN1;

import java.util.ArrayList;
import java.util.Scanner;

public class Cine {

    public static void main(String[] args) {


        int opcion;
        boolean salir = false;
        int sueldoAcomodador;

        Scanner entrada = new Scanner(System.in);
        ArrayList<Espectadores> espectadoresLista = Espectadores.getEspectadores();
        ArrayList<Empleados> empleadosLista = Empleados.getEmpleados();
        ArrayList<Acomodadores> acomodadoresLista = Acomodadores.getAcomodadores();
        ArrayList<Salas> salasLista = Salas.getSalas();



        System.out.println("*****Programa Gestión de Cine*****");


        System.out.println("\n\n*****SALA01*****");
        Salas sala1 = new Salas(3, "Sala 1");
        sala1.setPelicula("Joker");
        salasLista.add(sala1);
        System.out.println(sala1);

        System.out.println("\n\n*****EMPLEADOS*****");
        Empleados empleado1 = new Empleados("Ramon Gomez", 32);
        empleadosLista.add(empleado1);
        System.out.println("\nEmpleado designado a la sala: " + "\n"  + empleado1);

        System.out.println("\n\n*****ACOMODADORES*****");
        Acomodadores acomodador1 = new Acomodadores("Josefina", 25);
        acomodadoresLista.add(acomodador1);
        System.out.println("\nAcomodador designado a la sala: "  + "\n" + acomodador1);

        while (!salir){
            System.out.println("\n\nMENU");
            System.out.println("Digite un numero:");
            System.out.println("     1- Crear nueva sala");
            System.out.println("     2- Crear nuevo espectador");
            System.out.println("     3- Mostrar espectadores");
            System.out.println("     4- Crear nuevo empleado");
            System.out.println("     5- Mostrar empleados");
            System.out.println("     6- Mostrar acomodadores");
            System.out.println("     7- Modificar sueldo acomodador");
            System.out.println("     8- Salir");

            opcion = entrada.nextInt();

            if (opcion == 1){
                Salas.crearSala();
                Salas.mostrarSalas(salasLista);
            } else if (opcion == 2){
                Espectadores.crearEspectadores();
            } else if (opcion == 3){
                Espectadores.mostrarEspectadores(espectadoresLista);
            } else if (opcion == 4){
                Empleados.crearEmpleado();
            } else if (opcion == 5){
                Empleados.mostrarEmpleados(empleadosLista);
            } else if (opcion == 6){
                Acomodadores.mostrarAcomodadores(acomodadoresLista);
            } else if (opcion == 7){
                System.out.println("\n\nMODIFICANDO SUELDO ACOMODADOR....");
                System.out.println("Ingrese el salario: ");
                sueldoAcomodador = entrada.nextInt();
                acomodador1.setSueldo(sueldoAcomodador);
                System.out.println(acomodador1);
                System.out.println("Sueldo modificado");
            } else if (opcion == 8){
                salir = true;
            }
        }
    }
}
