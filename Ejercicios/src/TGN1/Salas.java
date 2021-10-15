package TGN1;

import java.util.Arrays;

public class Salas {
    private int capacidad;
    private String pelicula;
    private String nombre;
    private String[] espectadores;

    public Salas(int capacidad, String nombre) {
        this.capacidad = capacidad;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(String[] espectadores) {
        this.espectadores = espectadores;
    }

    @Override
    public String toString() {
        return "Salas{" +
                "capacidad=" + capacidad +
                ", pelicula='" + pelicula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", espectadores=" + Arrays.toString(espectadores) +
                '}';
    }
}
