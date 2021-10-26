package TGN1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Salas {

    Scanner entrada = new Scanner(System.in);

    private static ArrayList<Salas> salas = new ArrayList<>();
    private int capacidad;
    private String pelicula;
    private String nombre;
    private List<Espectadores> espectadores;


    public Salas() {
    }

    public Salas(int capacidad, String pelicula, String nombre) {
        this.capacidad = capacidad;
        this.pelicula = pelicula;
        this.nombre = nombre;
    }

    public Salas(int capacidad, String nombre) {
        this.capacidad = capacidad;
        this.nombre = nombre;
    }

    public static ArrayList<Salas> getSalas() {
        return salas;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getNombre() {
        return nombre;
    }


    public List<Espectadores> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(List<Espectadores> espectadores) {
        this.espectadores = espectadores;
    }

    @Override
    public String toString() {
        return "Sala {" +
                " nombre: " + nombre + "  /  " +
                "capacidad: " + capacidad + "  /  " +
                "pelicula: " + pelicula + "  /  " +
                "espectadores: " + espectadores +
                "}" + "\n";
    }

    public static Salas crearSala(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n\n*****CREANDO NUEVA SALA*****");
        String nombre;
        int capacidad;
        String pelicula;

        try {
            System.out.println("Escriba el nombre de la sala: ");
            nombre = entrada.nextLine();

            System.out.println("Escriba el nombre de la pelicula: ");
            pelicula = entrada.nextLine();

            System.out.println("Cual es la capacidad de la sala: ");
            capacidad = entrada.nextInt();

            Salas salaCreada = new Salas(capacidad, pelicula, nombre);

            salas.add(salaCreada);

        } catch (Exception e){
            System.out.println("Error al cargar los datos de la sala");
            System.out.println(e);
            return null;
        }

        System.out.println("Sala creada con exito!");
        System.out.println("Actualmente hay " + salas.size() + " salas creadas.");

        return new Salas(capacidad, pelicula, nombre);

    }

    static void mostrarSalas(ArrayList<Salas> salas){
        if (salas.size() > 0){
            System.out.println(salas);
        } else {
            System.out.println("No hay salas cargadas!");
        }
    }
}
