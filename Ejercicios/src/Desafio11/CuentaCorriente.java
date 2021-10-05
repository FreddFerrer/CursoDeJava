package Desafio11;

import java.util.Scanner;

public class CuentaCorriente {

    private double saldo;
    private String nombreTitular;
    public long numeroCuenta;

    Scanner entrada = new Scanner(System.in);

    //CONSTRUCTOR
    public CuentaCorriente(String nombreTitular, double saldo) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        this.numeroCuenta = (long) Math.random()*10;

    }

    //SETTER Y GETTER
    public double getSaldo() {
        return saldo;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public void mostrarInformacionDeCuenta() {
        System.out.println("Nombre del titular de la cuenta: " + this.getNombreTitular());
        System.out.println("Saldo: $" + this.getSaldo());
    }

    public void Transferencia(CuentaCorriente cuentaDestino ,double monto){
        if (saldo >= monto){
            cuentaDestino.setSaldo(cuentaDestino.getSaldo() + monto);
            this.setSaldo(this.getSaldo() - monto);
            System.out.println("Transferencia realizada.");
            System.out.println("INFORMACIÓN DE CUENTA DE ORIGEN:");
            this.mostrarInformacionDeCuenta();
            System.out.println("INFORMACIÓN DE CUENTA DESTINO:");
            cuentaDestino.mostrarInformacionDeCuenta();
        } else {
            System.out.println("ERROR, no dispone de saldo suficiente para realizar la transferencia.");
            this.mostrarInformacionDeCuenta();
        }
    }

}

