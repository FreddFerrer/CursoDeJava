import java.util.ArrayList;

public class Facultad implements Informacion {

    private String nombre;
    private ArrayList<Carrera> coleccionCarreras;

    public Facultad() {
    }

    public Facultad(String nombre, ArrayList<Carrera> coleccionCarreras) {
        this.nombre = nombre;
        this.coleccionCarreras = coleccionCarreras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Carrera> getColeccionCarreras() {
        return coleccionCarreras;
    }


    @Override
    public int verCantidad() {
        return this.coleccionCarreras.size();
    }

    @Override
    public String ListarContenidos() {
        String listado = "\nCarreras de la facultad " + this.nombre;
        for (Carrera carreras : coleccionCarreras){
            listado += carreras.getNombre();
        }
        return listado;
    }

    public void setColeccionCarreras(ArrayList<Carrera> coleccionCarreras) {
        this.coleccionCarreras = coleccionCarreras;
    }

    public void agregarCarrera (Carrera nombreCarrera){
        this.coleccionCarreras.add(nombreCarrera);
    }

    public void removerCarrera (Carrera nombreCarrera){
        boolean contiene = false;
        for (Carrera busqueda : coleccionCarreras) {
            if (busqueda == nombreCarrera){
                this.coleccionCarreras.remove(nombreCarrera);
                contiene = true;
            }
        }
        if (contiene){
            System.out.println("La carrera ha sido removida con exito!");
        } else {
            System.out.println("La carrera no se encuentra en la lista!!!");
        }
    }

    @Override
    public String toString() {
        String str ="Facultad" +
                "nombre= " + this.nombre.toUpperCase() +
                "\ncoleccionCarreras= " + this.coleccionCarreras +
                "\t";
        return str;
    }
}
