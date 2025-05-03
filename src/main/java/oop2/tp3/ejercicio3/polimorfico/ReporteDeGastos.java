package oop2.tp3.ejercicio3.polimorfico;

import java.time.LocalDate;
import java.util.List;

public class ReporteDeGastos {
    public static final String LABEL_EXPENSES = "Expenses ";
    public static final String LABEL_EXCESO_COMIDA = "X";
    public static final String LABEL_NO_EXCESO_COMIDA = " ";
    public static final String LABEL_GASTOS_COMIDA = "Gastos de comida: ";
    public static final String LABEL_TOTAL_GASTOS = "Total de gastos: ";

    public String imprimir(List<Gasto> gastos, LocalDate now) {
        int total = 0;

        int gastosDeComida = 0;
        String reporte = "";

        reporte += LABEL_EXPENSES + now + "\n";

        for (Gasto gasto : gastos) {
            int montoGasto = gasto.obtenerGasto();
            gastosDeComida += gasto.obtenerMontoComida();
            String marcaExcesoComidas = gasto.excesoGastoComida() ? LABEL_EXCESO_COMIDA : LABEL_NO_EXCESO_COMIDA;
            reporte += gasto.obtenerNombre() + "\t" + montoGasto + "\t" + marcaExcesoComidas + "\n";
            total += montoGasto;
        }

        reporte += LABEL_GASTOS_COMIDA + gastosDeComida + "\n";
        reporte += LABEL_TOTAL_GASTOS + total + "\n";
        return reporte;
    }
}