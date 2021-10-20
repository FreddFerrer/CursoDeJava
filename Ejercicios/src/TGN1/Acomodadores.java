package TGN1;

public class Acomodadores extends Empleados implements ParaAcomodadores{

    private Salas sala;

    public Acomodadores(String nombre, int edad, double sueldo, Salas sala) {
        super(nombre, edad, sueldo);
        this.sala = sala;
    }

    @Override
    public Salas getSala() {
        return this.sala;
    }

    @Override
    public void setSala(Salas sala) {
        this.sala = sala;
    }
}

