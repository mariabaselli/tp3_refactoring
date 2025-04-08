package oop2.tp3.ejercicio1.polimorfico;

import oop2.tp3.ejercicio1.procedural.Alquiler;
import oop2.tp3.ejercicio1.procedural.Cliente;
import oop2.tp3.ejercicio1.procedural.CopiaLibro;
import oop2.tp3.ejercicio1.procedural.Libro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlquilerTest {
    oop2.tp3.ejercicio1.procedural.Libro unLibro;
    oop2.tp3.ejercicio1.procedural.CopiaLibro unaCopia;
    oop2.tp3.ejercicio1.procedural.Cliente unCliente;
    oop2.tp3.ejercicio1.procedural.Alquiler alquilerProgrJava;

    @BeforeEach

    public void incializarVariables(){
        unLibro = new Libro("Programacion en Java", 0);
        unaCopia = new CopiaLibro(unLibro);
        unCliente = new Cliente("Maria");
        alquilerProgrJava = new Alquiler(unaCopia, 3);
        unCliente.alquilar(alquilerProgrJava);
    }

    @Test

    public void verificarLibro() {
        assertEquals(0, unLibro.codigoPrecio());
        assertEquals("Programacion en Java", unLibro.nombre());
    }

    @Test
    public void verificarAspectosClientes() {
        var resultado = unCliente.calcularDeudaYPuntosObtenidos();
        assertEquals(3.5,resultado[0]);
        assertEquals(1, resultado[1]);
    }

    @Test
    public void verificarAlquiler() {
        assertEquals(3, alquilerProgrJava.diasAlquilados());
          }

}
