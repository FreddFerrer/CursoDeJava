//Programa que pide ciertos datos al usuario.

package Variables;


import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {

        int edad;
        float salario = 0;


        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();

        try {
            System.out.println("Ingrese su salario: ");
            salario = entrada.nextFloat();
        }catch (Exception e){
            System.out.println("ERROR: la edad tiene que ir con coma, no con punto " + e);
        }

        System.out.println("Su nombre es " + nombre + " tiene " + edad + " anios, y su salario es de " + salario +
                " pesos");
    }
}
