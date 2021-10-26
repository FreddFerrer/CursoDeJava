package TGN1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Espectadores extends Persona{

    private static ArrayList<Espectadores> espectadores = new ArrayList<>();
    private int silla;
    private String fila;

    public Espectadores(String nombre, int edad, String fila, int silla) {
        super(nombre, edad);
        this.fila = fila;
        this.silla = silla;
    }

    public static ArrayList<Espectadores> getEspectadores() {
        return espectadores;
    }

    public int getSilla() {
        return silla;
    }

    public String getFila() {
        return fila;
    }

    @Override
    public String getTipo() {
        return getClass().getName();
    }

    @Override
    public String toString() {
        return "\n\nNombre: " + getNombre() +
                "\nEdad: " + getEdad() +
                "\nFila: " + fila +
                "\nSilla: " + silla;
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
            fila = entrada.next();

            System.out.print("\nIngrese el numero de la butaca: ");
            silla = entrada.nextInt();

            Espectadores espectadorCargado = new Espectadores(nombreCompleto, edad, fila, silla);

            espectadores.add(espectadorCargado);

            System.out.println(espectadorCargado);

        } catch (Exception e) {
            String error = "Error en el ingreso de datos. " + e;
            System.out.println(error);
            return null;
        }
        System.out.println("Espectador agregado con exito!");
        System.out.println("Actualmente hay " + espectadores.size() + " espectadores.");

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



}
