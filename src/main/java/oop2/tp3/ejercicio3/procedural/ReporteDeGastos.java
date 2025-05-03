package oop2.tp3.ejercicio3.procedural;

import java.time.LocalDate;
import java.util.List;

enum TipoDeGasto {
    CENA, DESAYUNO, ALQUILER_AUTO
}

class Gasto {
    TipoDeGasto tipoGasto;
    int monto;
}

public class ReporteDeGastos {
    public String imprimir(List<Gasto> gastos, LocalDate now) {
        int total = 0;
        int gastosDeComida = 0;
        String reporte = "";

        reporte += "Expenses " + now + "\n";


        for (Gasto gasto : gastos) {
            if (gasto.tipoGasto == TipoDeGasto.CENA || gasto.tipoGasto == TipoDeGasto.DESAYUNO) {
                gastosDeComida += gasto.monto;
            }

            String nombreGasto = "";
            switch (gasto.tipoGasto) {
                case CENA:
                    nombreGasto = "Cena";
                    break;
                case DESAYUNO:
                    nombreGasto = "Desayuno";
                    break;
                case ALQUILER_AUTO:
                    nombreGasto = "Alquiler de Autos";
                    break;
            }

            String marcaExcesoComidas = gasto.tipoGasto == TipoDeGasto.CENA && gasto.monto > 5000
                    || gasto.tipoGasto == TipoDeGasto.DESAYUNO && gasto.monto > 1000 ? "X" : " ";

            reporte += nombreGasto + "\t" + gasto.monto + "\t" + marcaExcesoComidas + "\n";

            total += gasto.monto;
        }

        reporte += "Gastos de comida: " + gastosDeComida + "\n";
        reporte += "Total de gastos: " + total + "\n";
        return reporte;
    }
}