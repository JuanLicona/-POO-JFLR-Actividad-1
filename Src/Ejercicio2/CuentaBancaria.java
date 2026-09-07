package Ejercicio2;

public class CuentaBancaria {

    float numeroCuenta;
    float saldo;
    String TipoCuenta;


    public CuentaBancaria(){

        int numeroCuenta = 0;
        int saldo = 0;
        int TipoCuenta = 0;
    }

    public CuentaBancaria(float numeroCuenta,String TipoCuenta){

        this.numeroCuenta = 402400434;
        this.TipoCuenta = "Ahorros";

    }

    public CuentaBancaria(float numeroCuenta,float saldo,String TipoCuenta){

        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.TipoCuenta = TipoCuenta;

    }


    public float getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(float numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public float getSaldo() {
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
