package oop2.tp3.ejercicio1.polimorfico;

public class Libro {
    private String nombre;
    private TipoLanzamiento lanzamiento;

    public Libro(String nombre, TipoLanzamiento lanzamiento) {
        this.nombre = nombre;
        this.lanzamiento = lanzamiento;
    }

    public String nombre() {
        return nombre;
    }

    public boolean esNuevoLanzamiento() {
        return lanzamiento.nuevoLanzamiento(this);
    }

    Libro copia() {
        return new Libro(this.nombre, this.lanzamiento);
    }

    double informarValor(Alquiler alquiler) {
        return this.lanzamiento.calcularCosto(alquiler);
    }


}