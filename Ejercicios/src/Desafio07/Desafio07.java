package Desafio07;

import java.util.Scanner;

public class Desafio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor = 0;
        double angulo = 45;
        double anguloRadianes = Math.toRadians(angulo);
        double x = 90.0;
        double y = 15.0;

        //Las dos contastantes PI y e:
        System.out.println("e = " + Math.E);
        System.out.println("pi = " + Math.PI);


        //Funciones trigonometricas habituales
        valor = Math.sin(anguloRadianes);
        System.out.println("El seno de " + angulo + " es: " + valor);

        valor = Math.cos(anguloRadianes);
        System.out.println("El coseno de " + angulo + " es: " + valor);

        valor = Math.tan(anguloRadianes);
        System.out.println("La tangente de " + angulo + " es: " + valor);

        valor = Math.atan(anguloRadianes);
        System.out.println("El arcotangente de " + angulo + " es: " + valor);

        valor = Math.atan2(x, y);
        System.out.println("El arcotangente de " + x + " e " + y + " es: " + valor);


        //La funcion exponencial y su inversa:
        System.out.println("La funcion exponencial de 2 es " + Math.exp(2));
        System.out.println("El logaritmo de 2 es " + Math.log(2));

    }
}