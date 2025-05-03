package oop2.tp3.ejercicio_tipo_parcial_polimorfico;

import oop2.tp3.ejercicio_tipo_parcial.polimorfico.Causa;
import oop2.tp3.ejercicio_tipo_parcial.polimorfico.Controlador;
import oop2.tp3.ejercicio_tipo_parcial.polimorfico.Juez;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ControladorTest {
    @Test
    void test01() {
        var c1 = new Causa();
        var c2 = new Causa();
        Juez j1 = Juez.cargarJuez("Juan", "Lopez");
        j1.agregarCausa(c1);

        Juez j2 = Juez.cargarJuez("Ricardo", "Perez");
        j2.agregarCausa(c2);
        Controlador controlador = new Controlador(List.of(j1, j2));
        assertEquals(2, controlador.calcularCausasTotales());

    }

    @Test
    void test002() {
        Exception e1 = assertThrows(RuntimeException.class, () -> Juez.cargarJuez("", "Lopez"));
        Exception e2 = assertThrows(RuntimeException.class, () -> Juez.cargarJuez("Leonardo", ""));
        assertEquals(Juez.LABEL_NOMBRE, e1.getMessage());
        assertEquals(Juez.LABEL_APELLIDO, e2.getMessage());
    }
}
