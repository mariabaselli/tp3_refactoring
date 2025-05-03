package oop2.tp3.ejercicio_tipo_parcial_procedural;
import oop2.tp3.ejercicio_tipo_parcial.procedural.Causa;
import oop2.tp3.ejercicio_tipo_parcial.procedural.Controlador;
import oop2.tp3.ejercicio_tipo_parcial.procedural.Juez;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ControladorTest {
    @Test
    void test01() {
        var c1 = new Causa();
        var c2 = new Causa();
        Juez j1 = new Juez("Juan", "Lopez");
        j1.agregarCausa(c1);

        Juez j2 = new Juez("Ricardo", "Perez");
        j2.agregarCausa(c2);
        Controlador controlador = new Controlador(List.of(j1, j2));

        assertEquals(2, controlador.calcularCausasTotales());


    }
}
