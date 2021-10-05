package EjercicioFacultad;
import java.util.Scanner;
import java.util.regex.*;

public class ValidacionDeDatos {

    Scanner entrada = new Scanner(System.in);

    public static String ingresarSoloLetras (Scanner entrada){
        Pattern encuentraNro = Pattern.compile("[0-9]");
        String nombre;
        Matcher m;

        while (true) {
            nombre = entrada.nextLine();
            m = encuentraNro.matcher(nombre);

            if (!(m.find())) {
                break;
            } else {
                System.out.println("Ingrese solo letras");
            }
        }

        nombre.trim();
        String[] str = nombre.split("\\s+");

        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].trim();
        }

        return ValidacionDeDatos.capitalizarPrimeraLetra(nombre);
    }

    public static int ingresarLegajo(Scanner entrada) {
        Pattern siEncuentraLetras = Pattern.compile("[A-Za-z\\s]");
        String legajo;
        Matcher m;

        while (true) {
            legajo = entrada.nextLine();
            // se evalua legajo, bajos las reglas que el matcher toma del pattern
            m = siEncuentraLetras.matcher(legajo);

            if (!(m.find()))
                break;
            else
                System.out.println("Ingresa un nro. de legajo correcto");
        }

        return Integer.parseInt(legajo);
    }

    private static String capitalizarPrimeraLetra(String str) {
        str.trim();
        String[] palabras = str.split("\\s+");
        String palabrasPimeraMayuscula = "";

        for (String palabra : palabras) {
            String primerLetra = palabra.substring(0, 1);
            String resto = palabra.substring(1);
            palabrasPimeraMayuscula += primerLetra.toUpperCase() + resto + " ";
        }

        return palabrasPimeraMayuscula.trim();
    }


}
