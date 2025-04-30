package oop2.tp3.ejercicio3.procedural;

import java.time.LocalDate;
import java.util.List;

public class EjemploDeUsoDelReporte {
    public static void main(String[] args) {
        var g1 = new Gasto();
        g1.tipoGasto = TipoDeGasto.DESAYUNO;
        g1.monto = 1000;
        var g2 = new Gasto();
        g2.tipoGasto = TipoDeGasto.CENA;
        g2.monto = 4500;
        var g3 = new Gasto();
        g3.tipoGasto = TipoDeGasto.ALQUILER_AUTO;
        g3.monto = 650;
        var reporte = new ReporteDeGastos();
        System.out.println(reporte.imprimir(List.of(g1, g2, g3), LocalDate.now()));
    }

}
