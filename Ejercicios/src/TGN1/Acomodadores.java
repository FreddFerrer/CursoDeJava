package TGN1;

import java.util.List;

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
}

