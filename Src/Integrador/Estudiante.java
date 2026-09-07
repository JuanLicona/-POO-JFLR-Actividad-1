package Integrador;



public class Estudiante {

    String Nombre;
    int Edad;
    String Curso;


    public Estudiante(){
        String Nombre= "Marcos";
        int Edad= 15 ;
        String Curso = "Decimo";
    }

    public Estudiante(String Nombre, int Edad){
        this.Nombre = Nombre;
        this.Edad = Edad;

    }
    public Estudiante(String Nombre, int Edad, String Curso){
        this(Nombre, Edad);
        this.Curso = Curso;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }


    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    public String getCurso() {
        return Curso;
    }
    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    @Override
    public String toString() {
        return "Estudiante [Nombre: " + Nombre + ", Edad: " + Edad + ", Curso: " + Curso + "]";
    }
}

