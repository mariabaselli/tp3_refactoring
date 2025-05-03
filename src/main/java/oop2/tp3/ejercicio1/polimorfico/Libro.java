package oop2.tp3.ejercicio1.polimorfico;

public class Libro {
    public static final String LABEL_NOMBRE_VACIO = "El nombre no puede estar vacio";
    private String nombre;
    private TipoLanzamiento lanzamiento;

    public Libro(String nombre, TipoLanzamiento lanzamiento) {
        this.nombre = nombre;
        if (nombre == null || nombre.isBlank()) {
            throw new RuntimeException(LABEL_NOMBRE_VACIO);
        }
        this.lanzamiento = lanzamiento;
    }

    public String nombre() {
        return nombre;
    }

    Libro copia() {
        return new Libro(this.nombre, this.lanzamiento);
    }

    double informarValor(int diasAlquilados) {
        return this.lanzamiento.calcularCosto(diasAlquilados);
    }

    public int otorgaPuntos() {
        return lanzamiento.otorgarPuntos();
    }
}