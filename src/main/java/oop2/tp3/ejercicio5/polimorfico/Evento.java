package oop2.tp3.ejercicio5.polimorfico;

public abstract class Evento {
    public static final String LABEL_NOMBRE_EVENTO = "El nombre del evento no puede estar vacio";
    private String nombre;

    public Evento(String nombreEvento) {
        if (nombreEvento == null || nombreEvento.isBlank()) {
            throw new RuntimeException(LABEL_NOMBRE_EVENTO);
        }
        this.nombre = nombreEvento;
    }

    protected String nombreEvento() {
        return this.nombre;
    }

    abstract float informarPago(Actuacion actuacion);

    abstract double informarCreditos(Actuacion actuacion);

    abstract boolean existeNombre(String nombre);
}
