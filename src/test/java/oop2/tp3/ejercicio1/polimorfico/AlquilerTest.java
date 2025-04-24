package oop2.tp3.ejercicio1.polimorfico;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlquilerTest {
    Libro unLibro;
    Libro libroInfantil;
    Libro libroNuevoLanzamiento;
    Cliente unCliente;
    Alquiler alquilerProgrJava;

    @BeforeEach

    public void incializarVariables() {
        unLibro = new Libro("Programacion en Java", new LanzamientoRegular());
        libroInfantil = new Libro("El Oso", new LanzamientoInfantil());
        libroNuevoLanzamiento = new Libro("Especial de cocina", new LanzamientoNuevo());
        unCliente = new Cliente("Maria");
        alquilerProgrJava = new Alquiler(unLibro, 3);

    }

    @Test

    public void verificarLibroNuevoLanzamiento() {
        var alquilerEspecial = new Alquiler(libroNuevoLanzamiento, 3);
        unCliente.alquilar(alquilerEspecial);
        assertEquals("Especial de cocina", libroNuevoLanzamiento.nombre());
        assertEquals(9, unCliente.calcularDeuda());
        assertEquals(2, unCliente.informarPuntos());
    }

    @Test
    public void verificarLibroLanzamientoRegular() {
        var alquilerRegular = new Alquiler(unLibro, 3);
        unCliente.alquilar(alquilerRegular);
        assertEquals("Programacion en Java", unLibro.nombre());
        var resultado = unCliente.calcularDeuda();
        assertEquals(3.0, resultado);
        assertEquals(1, unCliente.informarPuntos());
    }

    @Test
    public void verificarOtroLibroLanzamientoRegular() {
        var alquilerRegular = new Alquiler(unLibro, 1);
        unCliente.alquilar(alquilerRegular);
        assertEquals("Programacion en Java", unLibro.nombre());
        var resultado = unCliente.calcularDeuda();
        assertEquals(2.0, resultado);
        assertEquals(1, unCliente.informarPuntos());
    }

    @Test
    public void verificarLibroLanzamientoInfantil() {
        var alquilerInfantil = new Alquiler(libroInfantil, 3);
        unCliente.alquilar(alquilerInfantil);
        assertEquals("El Oso", libroInfantil.nombre());
        assertEquals(1.0, unCliente.calcularDeuda());
        assertEquals(1, unCliente.informarPuntos());
    }

    @Test
    public void verificarOtroLibroInfantil() {
        var alquilerInfantil = new Alquiler(libroInfantil, 5);
        unCliente.alquilar(alquilerInfantil);
        assertEquals(4.0, unCliente.calcularDeuda());
        assertEquals(1, unCliente.informarPuntos());
    }

    @Test
    public void verificarAlquiler() {
        assertEquals(3, alquilerProgrJava.diasAlquilados());
    }


    @Test

    public void verificarPuntosClientesSinAlquiler() {
        assertEquals(0, unCliente.informarPuntos());
    }

    @Test
    public void verificarNoPuntosExtrasPorDias() {
        var alquilerEspecial = new Alquiler(libroNuevoLanzamiento, 1);
        unCliente.alquilar(alquilerEspecial);
        assertEquals("Especial de cocina", libroNuevoLanzamiento.nombre());
        assertEquals(3, unCliente.calcularDeuda());
        assertEquals(1, unCliente.informarPuntos());
    }
}