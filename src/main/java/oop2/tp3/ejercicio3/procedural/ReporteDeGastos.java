package oop2.tp3.ejercicio3.procedural;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

enum TipoDeGasto {
    CENA, DESAYUNO, ALQUILER_AUTO
}

class Gasto {
    TipoDeGasto tipoGasto;
    int monto;
}

public class ReporteDeGastos {

    private int total;
    private int gastosDeComida;
    private List<String> reporte;

    public ReporteDeGastos() {
        this.total = 0;
        this.gastosDeComida = 0;
        this.reporte = new ArrayList<>();
    }

    public String imprimir(List<Gasto> gastos, LocalDate now) {

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

            total += gasto.monto;

            reporte.add("Expenses " + now + "\n" + nombreGasto + ": " +
                    gasto.monto + "\t" + marcaExcesoComidas + "\n" + "Gastos de comida: " +
                    gastosDeComida + "\n" + "Total de gastos: " + total + "\n");


        }

        return reporte.toString();
    }
}
