package TGN1;

import java.util.List;

public class Salas {
    private int capacidad;
    private String pelicula;
    private String nombre;
    private List<Espectadores> espectadores;

    public Salas(int capacidad, String nombre) {
        this.capacidad = capacidad;
        this.nombre = nombre;
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
        return "Salas{" +
                "capacidad: " + capacidad + "   /   " +
                "pelicula: " + pelicula + "   /   " +
                "nombre: " + nombre + "   /   " +
                "espectadores: " + espectadores +
                '}';
    }
}
