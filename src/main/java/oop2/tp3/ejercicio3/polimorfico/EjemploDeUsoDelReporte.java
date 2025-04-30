package oop2.tp3.ejercicio3.polimorfico;

import java.time.LocalDate;
import java.util.List;

public class EjemploDeUsoDelReporte {
    public static void main(String[] args) {
        var g1 = new Gasto(new Desayuno(), 1000);
        var g2 = new Gasto(new Cena(), 4500);
        var g3 = new Gasto(new AlquilerdeAutos(), 6500);
        var reporte = new ReporteDeGastos();
        System.out.println(reporte.imprimir(List.of(g1, g2, g3), LocalDate.now()));
    }

}
