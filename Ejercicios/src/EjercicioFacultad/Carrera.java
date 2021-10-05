import java.util.ArrayList;

public class Carrera implements Informacion {

    private String nombre;
    private ArrayList<Materia> coleccionMaterias;

    public Carrera() {
    }

    public Carrera(String nombre, ArrayList<Carrera> coleccionCarreras) {
        this.nombre = nombre;
        this.coleccionMaterias = coleccionMaterias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Materia> getColeccionCarreras() {
        return coleccionMaterias;
    }

    public void setColeccionCarreras(ArrayList<Materia> coleccionCarreras) {
        this.coleccionMaterias = coleccionCarreras;
    }

    @Override
    public int verCantidad() {
        return this.coleccionMaterias.size();
    }

    @Override
    public String ListarContenidos() {
        String str = "Listado de las materias en la carrera " + this.nombre + ":\n" + this.coleccionMaterias;
        return str;
    }

    public void agregarMateria(Materia materias){
        this.coleccionMaterias.add(materias);
    }

    public void removerMateria(String nombreMateria){
        boolean contiene = false;
        for (Materia elemento : coleccionMaterias){
            if (elemento.getNombre() == nombreMateria){
                this.coleccionMaterias.remove(elemento);
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
        for (Materia mat : coleccionMaterias){
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
}
