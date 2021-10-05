import java.util.ArrayList;

public class Materia implements Informacion{

    private String nombre;
    private String profesor;
    private ArrayList <Estudiante> coleccionEstudiantes;

    public Materia() {
    }

    public Materia(String nombre, String profesor, ArrayList<Estudiante> coleccionEstudiantes) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.coleccionEstudiantes = coleccionEstudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Estudiante> getColeccionEstudiantes() {
        return coleccionEstudiantes;
    }

    public void setColeccionEstudiantes(ArrayList<Estudiante> coleccionEstudiantes) {
        this.coleccionEstudiantes = coleccionEstudiantes;
    }

    @Override
    public int verCantidad() {
        return 0;
    }

    @Override
    public String ListarContenidos() {
        return null;
    }

    public void agregarEstudiante (Estudiante estudiante){
        this.coleccionEstudiantes.add(estudiante);
    }

    public void eliminarEstudiante (String estudiante){
        boolean contiene = false;
        for (Estudiante elemento : coleccionEstudiantes){
            if (elemento.getNombre() == estudiante){
                this.coleccionEstudiantes.remove(elemento);
                contiene = true;
            }
        }
        if (contiene) {
            System.out.println("Estudiante econtrado!");
        } else {
            System.out.println("Estudiante NO encontrado!!!!");
        }
    }
}
