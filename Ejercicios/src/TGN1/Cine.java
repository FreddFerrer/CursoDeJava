package TGN1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cine {

    public static void mostrarMenuPrincipal() {

        Scanner entrada = new Scanner(System.in);

        int opcion = 0, bandera = 0;

        do {
            do {
                System.out.println("*****Programa Gestión de Cine*****");
                System.out.println("\t\tMENU");
                System.out.println("Digite un numero:");
                System.out.println("\t1- Mostrar estado de Cine");
                System.out.println("\t2- Crear Sala");
                System.out.println("\t3- Crear Espectador");
                System.out.println("\t4- Mostrar Espectador");
                System.out.println("\t5- Crear Empleado");
                System.out.println("\t6- Mostrar Empleados");
                System.out.println("\t7- Crear Acomodador");
                System.out.println("\t8- Mostrar Acomodador");
                System.out.println("\t0- Salir");

                opcion = entrada.nextInt();

                if (opcion <= 9 && opcion >= 1) {
                    bandera = 1;
                } else {
                    System.out.println("Error");
                }


            } while (bandera == 0);

            switch (opcion){
                case 1:

                    break;

                case 2:

                    break;


                case 3:

                    break;


                case 4:

                    break;


                case 5:

                    break;


                case 6:

                    break;

                case 7:


                    break;


                case 8:

                    break;

                case 9:

                    bandera = 1;
                    break;
            }
        } while (bandera == 0);
    }


    public static Espectadores crearEspectadores() {
        String nombreCompleto;
        int edad;
        String fila;
        int silla;

        Scanner entrada = new Scanner(System.in);

        System.out.println("*****CREANDO ESPECTADOR*****");
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
            String error = "Error al cargar los datos. " + e;
            System.out.println(error);
            return null;
        }

        return new Espectadores(nombreCompleto, edad, fila, silla);
    }

    /*static boolean esSoloLetras(String cadena)
    {
        for (int i = 0; i < cadena.length(); i++)
        {
            char caracter = cadena.toUpperCase().charAt(i);
            int valorASCII = caracter;
            if (valorASCII != 165 && (valorASCII < 65 || valorASCII > 90))
                System.out.println("Por favor ingrese solo letras");
                return false;                                                   //Se ha encontrado un caracter que no es letra
        }

        return true;                                                               //todos los caracteres son letras
    }*/

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

        System.out.println("*****CREANDO SALA*****");
        Salas sala1 = new Salas(5, "Sala 1");
        sala1.setPelicula("Joker");
        System.out.println(sala1);


        
        Espectadores espectador1 = new Espectadores("Rodrigo Saforcada", 23, "A", 3);
        Espectadores espectador2 = new Espectadores("Cubo Cuadrado", 22, "B", 12);

        List<Espectadores> espectadores = new ArrayList<>();

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

        System.out.println(sala1);
    }
}
