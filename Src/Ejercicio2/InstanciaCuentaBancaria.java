package Ejercicio2;

public class InstanciaCuentaBancaria {

    static void main(String[] args) {

        CuentaBancaria CC = new CuentaBancaria();
        CuentaBancaria C0 = new CuentaBancaria(0,"");
        CuentaBancaria C1 = new CuentaBancaria(129102119,10000000,"Corriente");


        System.out.println("Datos de la cuenta Bancaria:");
        System.out.println("Numero de Cuenta:" + C0.getNumeroCuenta());
        System.out.println("Tipo de Cuenta:" + C0.getTipoCuenta());


        System.out.println("Datos de la cuenta Bancaria:");
        System.out.println("Numero de Cuenta:" + C1.getNumeroCuenta());
        System.out.println("Saldo Disponible:" + C1.getSaldo());
        System.out.println("Tipo de Cuenta:" + C1.getTipoCuenta());


    }


}
