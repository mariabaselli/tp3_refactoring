package oop2.tp3.ejercicio1.polimorfico;

public class Alquiler {
    Libro copiaLibro;
    private int diasAlquilados;

    public Alquiler(Libro libro, int diasAlquilados) {
        this.copiaLibro = libro.copia();
        this.diasAlquilados = diasAlquilados;
    }

    int diasAlquilados() {
        return this.diasAlquilados;
    }


    double calcularCosto() {
        return copiaLibro.informarValor(this);
    }

    boolean esNuevoLanzamiento() {
        return copiaLibro.esNuevoLanzamiento();
    }

    boolean otorgaPuntosExtra() {
        return esNuevoLanzamiento() && this.diasAlquilados() > 1;
    }
}
