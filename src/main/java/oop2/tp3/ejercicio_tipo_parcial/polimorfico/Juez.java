package oop2.tp3.ejercicio_tipo_parcial.polimorfico;


import java.util.ArrayList;
import java.util.Collection;

public class Juez {
    public static final String LABEL_NOMBRE = "Escriba un nombre por favor";
    public static final String LABEL_APELLIDO = "Escriba un apellido por favor";
    private String nombre;
    private String apellido;
    private Collection<Causa> causasACargo;

    private Juez(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.causasACargo = new ArrayList<>();
    }

    public static Juez cargarJuez(String nombre, String apellido) {
        assertNombre(nombre);
        assertApellido(apellido);
        return new Juez(nombre, apellido);
    }

    private static void assertNombre(String nombre) {
        if ((nombre == null) || nombre.trim().isEmpty()) {
            throw new RuntimeException(LABEL_NOMBRE);
        }
    }

    private static void assertApellido(String apellido) {
        if ((apellido == null) || apellido.trim().isEmpty()) {
            throw new RuntimeException(LABEL_APELLIDO);
        }
    }


    public void agregarCausa(Causa causa) {
        this.causasACargo.add(causa);
    }

    Collection<Causa> causas() {
        return causasACargo;
    }

    public int cantidadCausas() {
        return causasACargo.size();
    }
}
