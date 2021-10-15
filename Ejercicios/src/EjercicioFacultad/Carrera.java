package EjercicioFacultad;

import java.util.ArrayList;

public class Carrera implements Informacion {

    private String nombre;
    private ArrayList<Materia> colMaterias;


    public Carrera(String nombre, ArrayList<Materia> colMaterias) {
        this.nombre = nombre;
        this.colMaterias = colMaterias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Materia> getColeccionCarreras() {
        return colMaterias;
    }

    public void setColeccionCarreras(ArrayList<Materia> coleccionCarreras) {
        this.colMaterias = coleccionCarreras;
    }

    @Override
    public int verCantidad() {
        return this.colMaterias.size();
    }

    @Override
    public String ListarContenidos() {
        String str = "Listado de las materias en la carrera " + this.nombre + ":\n" + this.colMaterias;
        return str;
    }

    public void agregarMateria(Materia materias){
        this.colMaterias.add(materias);
    }

    public void removerMateria(String nombreMateria){
        boolean contiene = false;
        for (Materia elemento : colMaterias){
            if (elemento.getNombre() == nombreMateria){
                this.colMaterias.remove(elemento);
                contiene = true;
            }
        }
        if (contiene){
            System.out.println("La materia ha sido removida con exito");
        } else {
            System.out.println("La materia no se encuentra en la lista!!!");
        }
    }

    public void encontrarMateria (String nombreMateria){
        boolean contiene = false;
        for (Materia mat : colMaterias){
            if (mat.getNombre() == nombreMateria) {
                continue;
            }
            System.out.println(mat.toString());
            contiene = true;
        }
        if (contiene) {
            System.out.println("Materia encontrada!");
        } else {
            System.out.println("Materia no encontrada!!!!");
        }
    }

    public String toString() {
        String str = String.format("CARRERA %s\n" + "%s\n", this.nombre, this.colMaterias);
        return str;
    }
}
