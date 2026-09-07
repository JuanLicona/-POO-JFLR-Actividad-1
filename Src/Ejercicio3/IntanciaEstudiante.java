package Ejercicio3;

public class IntanciaEstudiante {


    static void main(String[] args) {

        Estudiante E1 = new Estudiante();
        Estudiante E2 = new Estudiante("Juan", 16);
        Estudiante E3 = new Estudiante("Danilo", 16,"Undecimo");



        System.out.println("Datos del estudiante:");
        System.out.println("Nombre:" + E1.getNombre());
        System.out.println("Edad:" + E1.getEdad());
        System.out.println("Curso:" + E1.getCurso());

        System.out.println("Datos del estudiante:");
        System.out.println("Nombre:" + E2.getNombre());
        System.out.println("Edad:" + E2.getEdad());

        System.out.println("Datos del estudiante:");
        System.out.println("Nombre:" + E3.getNombre());
        System.out.println("Edad:" + E3.getEdad());
        System.out.println("Curso:" + E3.getCurso());

    }
}



