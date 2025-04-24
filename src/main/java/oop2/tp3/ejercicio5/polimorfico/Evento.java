package oop2.tp3.ejercicio5.polimorfico;

public abstract class Evento {
    private String nombre;


    public Evento(String nombreEvento) {
        this.nombre = nombreEvento;
    }

    protected String nombreEvento() {
        return this.nombre;
    }

    abstract float informarPago(Actuacion actuacion);

    abstract double informarCreditos(Actuacion actuacion);

    abstract boolean existeNombre(String nombre);
}
