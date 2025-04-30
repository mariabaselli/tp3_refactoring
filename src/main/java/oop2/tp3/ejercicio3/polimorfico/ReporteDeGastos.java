package oop2.tp3.ejercicio3.polimorfico;

import java.time.LocalDate;
import java.util.List;

public class ReporteDeGastos {


    public String imprimir(List<Gasto> gastos, LocalDate now) {
        int total = 0;
        int gastosDeComida = 0;
        String reporte = "";

        reporte += "Expenses " + now + "\n";

        for (Gasto gasto : gastos) {
            gastosDeComida += gasto.obtenerMontoComida();
            String marcaExcesoComidas = gasto.excesoGastoComida() ? "X" : " ";

            reporte += gasto.obtenerNombre() + "\t" + gasto.monto + "\t" + marcaExcesoComidas + "\n";

            total += gasto.monto;
        }

        reporte += "Gastos de comida: " + gastosDeComida + "\n";
        reporte += "Total de gastos: " + total + "\n";
        return reporte;
    }
}