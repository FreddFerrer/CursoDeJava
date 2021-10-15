package TGN1;

public class Espectadores extends Persona{
    private int silla;
    private char fila;

    public Espectadores(String nombre, int edad, char fila, int silla) {
        super(nombre, edad);
        this.fila = fila;
        this.silla = silla;
    }

    public int getSilla() {
        return silla;
    }

    public char getFila() {
        return fila;
    }

    @Override
    public void rolPersona() {

    }

    @Override
    public void datosPersona() {

    }
}
