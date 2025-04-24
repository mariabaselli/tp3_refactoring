package oop2.tp3.ejercicio3.polimorfico;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReporteTest {

    @Test
    public void verificarGastoComida() {
        var g1 = new Gasto(new Desayuno(), 450);
        var g2 = new Gasto(new Cena(), 6000);
        var reporte = new ReporteDeGastos();
        var resultado = reporte.imprimir(List.of(g1, g2), LocalDate.of(2025, 04, 18));
        assertEquals("[Expenses 2025-04-18\n" +
                "Desayuno: 450\t \n" +
                "Gastos de comida: 450\n" +
                "Total de gastos: 450\n" +
                ", Expenses 2025-04-18\n" +
                "Cena: 6000\tX\n" +
                "Gastos de comida: 6450\n" +
                "Total de gastos: 6450\n" +
                "]", resultado);
    }


    @Test

    public void verificarGastosAlquilerAuto() {
        var g1 = new Gasto(new Alquiler_Auto(), 5000);
        var reporte = new ReporteDeGastos();
        var resultado = reporte.imprimir(List.of(g1), LocalDate.of(2025, 04, 18));
        assertEquals("[Expenses 2025-04-18\n" +
                "Alquiler de Autos: 5000\t \n" +
                "Gastos de comida: 0\n" +
                "Total de gastos: 5000\n" +
                "]", resultado);
    }

    @Test
    public void verificarGastosDesayunoMayor1000() {
        var g1 = new Gasto(new Desayuno(), 1500);
        var reporte = new ReporteDeGastos();
        var resultado = reporte.imprimir(List.of(g1), LocalDate.of(2025, 04, 20));
        assertEquals("[Expenses 2025-04-20\n" +
                "Desayuno: 1500\tX\n" +
                "Gastos de comida: 1500\n" +
                "Total de gastos: 1500\n" +
                "]", resultado);
    }

    @Test
    public void verificarGastosCenaMayor5000() {
        var g1 = new Gasto(new Cena(), 5500);
        var reporte = new ReporteDeGastos();
        var resultado = reporte.imprimir(List.of(g1), LocalDate.of(2025, 04, 20));
        assertEquals("[Expenses 2025-04-20\n" +
                "Cena: 5500\tX\n" +
                "Gastos de comida: 5500\n" +
                "Total de gastos: 5500\n" +
                "]", resultado);
    }


    @Test

    public void verificarcenaYAlquilerAuto() {
        var g2 = new Gasto(new Cena(), 4500);
        var g3 = new Gasto(new Alquiler_Auto(), 200);
        var reporte = new ReporteDeGastos();
        var resultado = reporte.imprimir(List.of(g2, g3), LocalDate.of(2025, 04, 20));
        assertEquals("[Expenses 2025-04-20\n" +
                "Cena: 4500\t \n" +
                "Gastos de comida: 4500\n" +
                "Total de gastos: 4500\n" +
                ", Expenses 2025-04-20\n" +
                "Alquiler de Autos: 200\t \n" +
                "Gastos de comida: 4500\n" +
                "Total de gastos: 4700\n" +
                "]", resultado);

    }

}


