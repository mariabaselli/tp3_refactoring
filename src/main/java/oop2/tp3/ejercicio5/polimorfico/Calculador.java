package oop2.tp3.ejercicio5.polimorfico;

import java.util.List;

public class Calculador {


    public String reporte(Factura factura, List<Evento> eventos) {
        float totalAmount = 0;
        double creditos = 0;
        var result = "Facturación para " + factura.nombreCliente() + System.lineSeparator();
        var actuaciones = factura.actuaciones();
        for (var actuacion : actuaciones) {
            float monto = 0;
            Evento eventoRelacionado = eventos.stream()
                    .filter(e -> e.existeNombre(actuacion.nombreEvento()))
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("Tipo de evento no conocido"));

            monto = eventoRelacionado.informarPago(actuacion);
            creditos += eventoRelacionado.informarCreditos(actuacion);
            result += actuacion.nombreEvento() + ": " + monto + ". Asientos: " + actuacion.numberoEspectadores() + System.lineSeparator();//` ${play.name}: ${format(thisAmount/100)} (${perf.audience} seats)\n`;
            totalAmount += monto;

        }

        result += "Monto ganado: " + totalAmount + System.lineSeparator();
        result += "Créditos ganados: " + creditos + System.lineSeparator();

        return result;
    }


}
