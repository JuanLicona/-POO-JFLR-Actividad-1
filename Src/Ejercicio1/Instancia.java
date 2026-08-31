package Ejercicio1;

public class Instancia {

    static void main(String[] args) {

        Libro L1 = new Libro("El desastroso Max Crumbly. Caos escolar", "Rachel Renée Russell", 240, "14/02/2017");



        //Gett y Impresión

        System.out.println("ee.Libro Escogido");
        System.out.println("Titulo:" + L1.getTitulo());
        System.out.println("Autor:" + L1.getAutor());
        System.out.println("Numero de Paginas:" + L1.getNumeroPaginas());
        System.out.println("Fecha de Publicacion:" + L1.getFechaPublicacion());

    }
}
