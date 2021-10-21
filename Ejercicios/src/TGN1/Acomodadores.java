package TGN1;

public class Acomodadores extends Empleados implements ParaAcomodadores{

    private Salas sala;
    private double sueldo;


    public Acomodadores(String nombre, int edad) {
        super(nombre, edad);
    }

    public Acomodadores(String nombre, int edad, double sueldo, Salas sala) {
        super(nombre, edad, sueldo);
        this.sala = sala;
    }

    @Override
    public double getSueldo() {
        return sueldo;
    }

    @Override
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
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

