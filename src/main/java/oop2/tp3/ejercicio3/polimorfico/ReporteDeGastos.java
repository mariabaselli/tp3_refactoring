package oop2.tp3.ejercicio3.polimorfico;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReporteDeGastos {

    public static final int TOPE_MONTO_CENA = 5000;
    public static final int TOPE_MONTO_DESAYUNO = 1000;
    private int total;
    private int acumulableGastoComida;
    private List<String> reporte;
    private String marcaExcesoComidas;
    private int gastoCena;
    private int gastoDesayuno;
    private int gastoComida;


    public ReporteDeGastos() {
    }

    public String imprimir(List<Gasto> gastos, LocalDate now) {
        this.reporte = new ArrayList<>();
        inicializarVariables(gastos, now);
        return reporte.toString();
    }

    private void inicializarVariables(List<Gasto> gastos, LocalDate now) {
        for (Gasto gasto : gastos) {
            obtenerDetalleDeGastos(gasto);
            obtenerMarcaExceso();
            generarReporte(gasto, now);
        }
    }

    private void obtenerDetalleDeGastos(Gasto gasto) {
        this.gastoCena = gasto.obtenerGastoCena();
        this.gastoDesayuno = gasto.obtenerGastoDesayuno();
        this.gastoComida = gastoCena + gastoDesayuno;
        total += gasto.obtenerGasto();
        acumulableGastoComida += gastoComida;
    }

    private void generarReporte(Gasto gasto, LocalDate now) {
        reporte.add("Expenses " + now + "\n" + gasto.obtenerNombre() + ": " + gasto.obtenerGasto() + "\t" + marcaExcesoComidas + "\n" + "Gastos de comida: " + acumulableGastoComida + "\n" + "Total de gastos: " + total + "\n");
    }

    private void obtenerMarcaExceso() {
        marcaExcesoComidas = (gastoCena > TOPE_MONTO_CENA) || gastoDesayuno > TOPE_MONTO_DESAYUNO ? "X" : " ";
    }

}
