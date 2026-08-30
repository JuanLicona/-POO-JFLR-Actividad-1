public class Libro {

    String titulo;
    String autor;
    int numeroPaginas;
    String fechaPublicacion;

public Libro() {

    this.titulo = "El principito";
    this.autor = "Antoine de Saint-exupery";
    this.numeroPaginas = 120 ;
    this.fechaPublicacion = "06-04-1943";
}

public Libro(String titulo, String autor, int numeroPaginas, String fechaPublicacion) {

    this.titulo = titulo;
    this.autor = autor;
    this.numeroPaginas = numeroPaginas;
    this.fechaPublicacion = fechaPublicacion;

}



}
