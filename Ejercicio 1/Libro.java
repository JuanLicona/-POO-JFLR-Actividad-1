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

// Metodos para mostrar detalles del libro
// Gett

    public String getTitulo(){
        return this.titulo = titulo;

    }

    public String getAutor(){
      return this.autor = autor;
    }

    public int getNumeroPaginas(){
        return this.numeroPaginas = numeroPaginas;
    }

    public String getFechaPublicacion(){
       return this.fechaPublicacion = fechaPublicacion ;
    }

// Sett

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String Autor){
        this.autor = Autor;
    }

    public void setNumeroPaginas(String NumeroPaginas){
        this.numeroPaginas = numeroPaginas;
    }

    public void setFechaPublicacion(String FechaPublicacion){
        this.fechaPublicacion = fechaPublicacion ;
    }




}
