package Ejercicio2;

public class CuentaBancaria {

    double numeroCuenta;
    double saldo;
    String TipoCuenta;


    public CuentaBancaria(){

        double numeroCuenta = 0;
        double saldo = 0;
        String TipoCuenta = "";
    }

    public CuentaBancaria(double numeroCuenta,String TipoCuenta){

        this.numeroCuenta = 402400434;
        this.TipoCuenta = "Ahorros";

    }

    public CuentaBancaria(double numeroCuenta,double saldo,String TipoCuenta){

        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.TipoCuenta = TipoCuenta;

    }


    public double getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(float numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public String getTipoCuenta() {
        return TipoCuenta;
    }
    public void setTipoCuenta(String TipoCuenta) {
        this.TipoCuenta = TipoCuenta;
    }


}
