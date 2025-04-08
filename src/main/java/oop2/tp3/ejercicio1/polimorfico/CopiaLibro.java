package oop2.tp3.ejercicio1.polimorfico;

public class CopiaLibro {
    private Libro libro;

    public CopiaLibro(Libro libro) {
        this.libro = libro;
    }

    public Libro libro() {
        return libro;
    }
}