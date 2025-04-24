package oop2.tp3.ejercicio5.procedural;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadorTest {

    @Test
    void verificarReporte() {
        Factura unaFactura = new Factura("c1", List.of(new Actuacion("Escuela de Rock", 158),
                new Actuacion("Hamlet", 103),
                new Actuacion("El Perfume", 8)));
        List<Evento> eventos = List.of(new Evento("Escuela de Rock", "Comedia"),
                new Evento("Hamlet", "Drama"),
                new Evento("El Avion", "Dram"),
                new Evento("Cantando en la playa", "Comedia"),
                new Evento("El Perfume", "Drama"));
        Calculador calculador = new Calculador();
        String resultado = calculador.reporte(unaFactura, eventos);

        String esperado = """
                Facturación para c1
                Escuela de Rock: 156400.0. Asientos: 158
                Hamlet: 113000.0. Asientos: 103
                El Perfume: 40000.0. Asientos: 8
                Monto ganado: 309400.0
                Créditos ganados: 232.0""";

        assertLinesMatch(Arrays.asList(esperado.split("\\R")), Arrays.asList(resultado.split("\\R")));
    }

    @Test
    void verificarActuacionEspectadoresMenorVeinte() {
        Factura unaFactura = new Factura("c1", List.of(new Actuacion("Cantando en la playa", 8)));
        List<Evento> eventos = List.of(new Evento("Cantando en la playa", "Comedia"));
        Calculador calculador = new Calculador();
        String resultado = calculador.reporte(unaFactura, eventos);
        String esperado = """
                Facturación para c1
                Cantando en la playa: 32400.0. Asientos: 8
                Monto ganado: 32400.0
                Créditos ganados: 1.0""";

        assertLinesMatch(Arrays.asList(esperado.split("\\R")), Arrays.asList(resultado.split("\\R")));
    }


    @Test
    void verificarEventoDesconocido() {
        Factura unaFactura = new Factura("c1", List.of(new Actuacion("Cantando en la playa", 8)));
        List<Evento> eventos = List.of(new Evento("Cantando en la playa", "Ciencia Ficcion"));
        Calculador calculador = new Calculador();
        Exception exception = assertThrows(RuntimeException.class, () -> calculador.reporte(unaFactura, eventos));
        assertEquals("Tipo de evento no conocido", exception.getMessage());
    }
}
