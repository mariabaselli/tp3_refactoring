package oop2.tp3.ejercicio3.polimorfico;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReporteTest {

    @Test

    public void verificarTiposGasto() {
        var g1 = new Gasto(new Desayuno(), 1000);
        var g2 = new Gasto(new Cena(), 4500);
        var g3 = new Gasto(new AlquilerdeAutos(), 6500);
        var reporte = new ReporteDeGastos();
        var resultado = reporte.imprimir(List.of(g1, g2, g3), LocalDate.of(2025, 5, 8));
        assertEquals("Expenses 2025-05-08\n" +
                "Desayuno\t1000\t \n" +
                "Cena\t4500\t \n" +
                "Alquiler de Autos\t6500\t \n" +
                "Gastos de comida: 5500\n" +
                "Total de gastos: 12000\n", resultado);

    }

    @Test
    public void gastoCenaMayorCincoMil() {
        var g1 = new Gasto(new Cena(), 5500);
        var reporte = new ReporteDeGastos();
        var resultado = reporte.imprimir(List.of(g1), LocalDate.of(2025, 5, 8));
        assertEquals("Expenses 2025-05-08\n" +
                "Cena\t5500\tX\n" +
                "Gastos de comida: 5500\n" +
                "Total de gastos: 5500\n", resultado);
    }

    @Test
    public void gastoDesayunoMayorMil() {
        var g1 = new Gasto(new Desayuno(), 1100);
        var reporte = new ReporteDeGastos();
        var resultado = reporte.imprimir(List.of(g1), LocalDate.of(2025, 5, 8));
        assertEquals("Expenses 2025-05-08\n" +
                "Desayuno\t1100\tX\n" +
                "Gastos de comida: 1100\n" +
                "Total de gastos: 1100\n", resultado);
    }
}
