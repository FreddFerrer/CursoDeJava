package TGN1;

import java.util.List;

public class Espectadores extends Persona{
    private int silla;
    private String fila;

    public Espectadores(String nombre, int edad, String fila, int silla) {
        super(nombre, edad);
        this.fila = fila;
        this.silla = silla;
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
        return "\nombre: " + getNombre() +
                "\nedad: " + getEdad() +
                "\nfila: " + fila +
                "\nsilla: " + silla;
    }


}
