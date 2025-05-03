package oop2.tp3.ejercicio5.polimorfico;

import java.util.List;

import static java.lang.System.lineSeparator;

public class Calculador {

    public static final String LABEL_FACTURACION = "Facturación para ";
    public static final String LABEL_EVENTO_DESCONOCIDO = "Tipo de evento no conocido";
    public static final String LABEL_ASIENTOS = ". Asientos: ";
    public static final String LABEL_MONTO_GANADO = "Monto ganado: ";
    public static final String LABEL_CREDITOS_GANADOS = "Créditos ganados: ";

    public String reporte(Factura factura, List<Evento> eventos) {
        float totalAmount = 0;
        double creditos = 0;
        var result = LABEL_FACTURACION + factura.nombreCliente() + lineSeparator();
        var actuaciones = factura.actuaciones();
        for (var actuacion : actuaciones) {
            float monto = 0;
            Evento eventoRelacionado = eventos.stream()
                    .filter(e -> e.existeNombre(actuacion.nombreEvento()))
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException(LABEL_EVENTO_DESCONOCIDO));

            monto = eventoRelacionado.informarPago(actuacion);
            creditos += eventoRelacionado.informarCreditos(actuacion);
            result += actuacion.nombreEvento() + ": " + monto + LABEL_ASIENTOS + actuacion.numeroEspectadores() + lineSeparator();//` ${play.name}: ${format(thisAmount/100)} (${perf.audience} seats)\n`;
            totalAmount += monto;

        }

        result += LABEL_MONTO_GANADO + totalAmount + lineSeparator();
        result += LABEL_CREDITOS_GANADOS + creditos + lineSeparator();

        return result;
    }


}
