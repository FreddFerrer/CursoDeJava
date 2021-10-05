package Desafio11;

public class UsoCuenta {
    public static void main(String[] args) {

        CuentaCorriente cuenta1 = new CuentaCorriente("Freddy", 4000);
        System.out.println("Cuenta bancaria de " + cuenta1.getNombreTitular().toString() + " posee " + cuenta1.getSaldo() + "$" );

        CuentaCorriente cuenta2 = new CuentaCorriente("Martin", 3000);
        System.out.println("Cuenta bancaria de " + cuenta2.getNombreTitular().toString() + " posee " + cuenta2.getSaldo() + "$" );

        cuenta1.Transferencia(cuenta2, 50);


    }
}
