package oop2.tp3.ejercicio2.polimorfico;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Recaudacion {
    public static final String COMPANY_NAME = "company_name";
    public static final String CITY = "city";
    public static final String STATE = "state";
    public static final String ROUND = "round";
    public static final int INDICE_COMPANY_NAME = 1;
    public static final int INDICE_CITY = 4;
    public static final int INDICE_STATE = 5;
    public static final int INDICE_ROUND = 9;
    private List<String[]> csvData;
    private Map<String, String> filtrosDeBusqueda;
    private Map<String, Integer> mapNombreIndice;

    public Recaudacion(FuenteDeDatos fuenteDeDatos) throws IOException {
        this.filtrosDeBusqueda = new HashMap<>();
        this.mapNombreIndice = Map.of(COMPANY_NAME, INDICE_COMPANY_NAME,
                CITY, INDICE_CITY, STATE, INDICE_STATE, ROUND, INDICE_ROUND);
        try {
            this.csvData = fuenteDeDatos.toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Map<String, String>> ejecturarQuery() {
        if (filtrosDeBusqueda == null) {
            throw new RuntimeException("Los filtros de búsqueda están vacios");
        }
        for (String nombreColumna : filtrosDeBusqueda.keySet()) {
            List<String[]> results = csvData
                    .stream()
                    .filter(csvDatum -> csvDatum[this.mapNombreIndice.get(nombreColumna)].
                            equals(filtrosDeBusqueda.get(nombreColumna)))
                    .collect(Collectors.toList());

            csvData = results;
        }

        return crearResultado();
    }


    List<Map<String, String>> crearResultado() {
        List<Map<String, String>> output = new ArrayList<>();

        for (String[] csvDatum : csvData) {
            Map<String, String> mapped = new HashMap<>();
            mapped.put("permalink", csvDatum[0]);
            mapped.put("company_name", csvDatum[1]);
            mapped.put("number_employees", csvDatum[2]);
            mapped.put("category", csvDatum[3]);
            mapped.put("city", csvDatum[4]);
            mapped.put("state", csvDatum[5]);
            mapped.put("funded_date", csvDatum[6]);
            mapped.put("raised_amount", csvDatum[7]);
            mapped.put("raised_currency", csvDatum[8]);
            mapped.put("round", csvDatum[9]);
            output.add(mapped);
        }
        return output;
    }

    public Recaudacion filtrarPor(String nombreColumna, String valorColumna) {
        this.filtrosDeBusqueda.put(nombreColumna, valorColumna);
        return this;
    }
}
