package oop2.tp3.ejercicio1.polimorfico;

public interface TipoLanzamiento {
    double calcularCosto(Alquiler alquiler);
    boolean nuevoLanzamiento(Libro libro);
}
