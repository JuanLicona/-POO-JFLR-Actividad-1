package Integrador;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al sistema integrador");
        System.out.println("Registro de Estudiante");
        System.out.println("Ingrese su nombre:");
        String nombre = sc.nextLine(); //


        System.out.println("Ingrese su edad:");
        int edad = sc.nextInt(); //

        System.out.println("Ingrese su curso:");
        String curso = sc.nextLine();//

        sc.nextLine();

        Estudiante EstudianteNew = new Estudiante(nombre, edad, curso);


        System.out.println("Registre el Libro Escogido");
        System.out.println("Ingrese su Titular:");
        String titulo = sc.nextLine(); //

        System.out.println("Ingrese su Autor:");
        String autor = sc.nextLine(); //

        System.out.println("Ingrese su Numero de Paginas:");
        int NumerodePaginas = sc.nextInt(); //

        System.out.println("Ingrese su Fecha de Publicacion:");
        String fechaPublicacion = sc.nextLine(); //

        sc.nextLine();

        Libro libroN = new Libro(titulo, autor, NumerodePaginas, fechaPublicacion);

        System.out.println("Registro de Cuenta Bancaria para Pago");
        System.out.println("Ingrese su Numero de Cuenta Bancaria:");
        Double NumeroCuenta = sc.nextDouble(); //

        System.out.println("Ingrese su Saldo:");
        Double saldo = sc.nextDouble(); //

        System.out.println("Ingrese su Tipo de Cuenta Bancaria:");
        String TipoBancaria = sc.nextLine(); //

        sc.nextLine();


        CuentaBancaria CuentaBancariaN = new CuentaBancaria( NumeroCuenta, saldo, TipoBancaria);


        System.out.println("Datos de Obtenidos de Registros:");
        System.out.println(EstudianteNew.toString());
        System.out.println(libroN.toString());
        System.out.println(CuentaBancariaN.toString());

        sc.close();
    }
}
