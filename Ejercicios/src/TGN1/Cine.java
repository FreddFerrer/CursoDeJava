package TGN1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cine {


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

        } catch (Exception e) {
            String error = "Error al cargar los datos. " + e;
            System.out.println(error);
            return null;
        }
        return new Empleados(nombreCompleto, edad, sueldo);
    }


    public static Espectadores crearEspectadores() {
        String nombreCompleto;
        int edad;
        String fila;
        int silla;

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n\n*****CREANDO ESPECTADOR*****");
        try{
            System.out.print("Ingrese el nombre y apellido: ");
            nombreCompleto = entrada.nextLine();

            System.out.print("\nIngrese la edad: ");
            edad = entrada.nextInt();

            System.out.print("\nIngrese la fila de asientos: ");
            fila = entrada.nextLine();

            System.out.print("\nIngrese el numero de la butaca: ");
            silla = entrada.nextInt();
        } catch (Exception e) {
            String error = "Error en el ingreso de datos. " + e;
            System.out.println(error);
            return null;
        }

        return new Espectadores(nombreCompleto, edad, fila, silla);

    }
    public static void mostrarEspectadores(List<Espectadores> listaEspectadores) {
        System.out.println("\nLista de espectadores:");

        if (listaEspectadores.size() == 0)
            System.out.println("No hay espectadores cargados.");
        else {
            for (Espectadores espectadores : listaEspectadores) {
                System.out.println(espectadores);
            }
        }
    }

    public static void mostrarEmpleados(List<Empleados> listaEmpleados) {
        System.out.println("\nLista de empleados:");

        if (listaEmpleados.size() == 0)
            System.out.println("No hay empleados cargados.");
        else {
            for (Empleados empleados : listaEmpleados) {
                System.out.println(empleados);
            }
        }
    }

    public static void mostrarAcomodadores(List<Acomodadores> listaAcomodadores) {
        System.out.println("\nLista de acomodadores:");

        if (listaAcomodadores.size() == 0)
            System.out.println("No hay acomodadores cargados.");
        else {
            for (Acomodadores acomodadores : listaAcomodadores) {
                System.out.println(acomodadores);
            }
        }
    }

    static void cargarEspectadores (List<Espectadores> listaEspectadores, Salas sala ){
        if (sala.getEspectadores().size() <= sala.getCapacidad()){
            Espectadores espectadorAgregado = Cine.crearEspectadores();
            if (espectadorAgregado != null){
                listaEspectadores.add(espectadorAgregado);
                System.out.println("Espectador agregado.");
            } else {
                System.out.println("No se pudo agregar el espectador");
            }
        } else {
            System.out.println("Sala completa!!");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Espectadores> espectadores = new ArrayList<>();
        ArrayList<Empleados> empleados = new ArrayList<>();
        ArrayList<Acomodadores> acomodadores = new ArrayList<>();

        int opcion = 0, bandera = 0, sueldoAcomodador;

        System.out.println("*****Programa Gestión de Cine*****");


        System.out.println("\n\n*****SALA01*****");
        Salas sala1 = new Salas(3, "Sala 1");
        sala1.setPelicula("Joker");
        System.out.println(sala1);

        System.out.println("\n\n*****EMPLEADOS*****");
        Empleados empleado1 = new Empleados("Ramon Gomez", 32);
        System.out.println("\nEmpleado designado a la sala: " + "\n" + empleado1.toString());

        System.out.println("\n\n*****ACOMODADORES*****");
        Acomodadores acomodador1 = new Acomodadores("Josefina", 25);
        System.out.println("\nAcomodador designado a la sala: " + "\n" + acomodador1.toString());


        do {
            do {
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

                if (opcion <= 8 && opcion >= 1) {
                    bandera = 1;
                } else {
                    System.out.println("Error");
                }

            } while (bandera == 0);

            if (opcion == 1){
                System.out.println("\n\n*****CREANDO NUEVA SALA*****");
            } else if (opcion == 2){
                crearEspectadores();
            } else if (opcion == 3){
                mostrarEspectadores(espectadores);
            } else if (opcion == 4){
                crearEmpleado();
            } else if (opcion == 5){
                mostrarEmpleados(empleados);
            } else if (opcion == 6){
                mostrarAcomodadores(acomodadores);
            } else if (opcion == 7){
                System.out.println("\n\nMODIFICANDO SUELDO ACOMODADOR....");
                System.out.println("Ingrese el salario: ");
                sueldoAcomodador = entrada.nextInt();
                acomodador1.setSueldo(sueldoAcomodador);
                System.out.println(acomodador1);
                System.out.println("Sueldo modificado");
            } else if (opcion == 0){
                bandera = 1;
            }

        } while (bandera == 0);




        
        /*Espectadores espectador1 = new Espectadores("Rodrigo Saforcada", 23, "A", 3);
        Espectadores espectador2 = new Espectadores("Cubo Cuadrado", 22, "B", 12);


        espectadores.add(espectador1);
        espectadores.add(espectador2);
        
        sala1.setEspectadores(espectadores);

        System.out.println("\n\n*****CREANDO SALA CON ESPECTADORES*****");
        System.out.println(sala1);

        Empleados empleado1 = new Empleados("Ramon Gomez", 32, 45000);
        Empleados empleado2 = new Empleados("Jose Montoya", 41, 50000);
        System.out.println("\n\n*****CREANDO EMPLEADOS*****");
        System.out.println(empleado1);
        System.out.println(empleado2);
        empleado1.setSueldo(52000);
        empleado2.setSueldo(60000);

        Acomodadores acomodador1 = new Acomodadores("Federico", 22, 20000, sala1);
        Acomodadores acomodador2 = new Acomodadores("Josefina", 25, 18000, sala1);
        System.out.println("\n\n*****CREANDO ACOMODADORES*****");
        System.out.println(acomodador1);
        System.out.println(acomodador2);
        System.out.println("\n\n*****CONFIGURANDO EMPLEADOS*****");
        acomodador1.setSueldo(22000);
        System.out.println(acomodador1);
        acomodador2.setSueldo(21000);
        System.out.println(acomodador2);

        Espectadores espectador3 = crearEspectadores();
        if (espectador3 != null){
            espectadores.add(espectador3);
        } else {
            System.out.println("Error al ingresar el espectador");
        }
        System.out.println("\n\n*****MODIFICANDO SALA*****");
        System.out.println(sala1);*/
    }


}
