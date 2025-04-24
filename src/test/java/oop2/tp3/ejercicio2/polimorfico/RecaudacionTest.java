package oop2.tp3.ejercicio2.polimorfico;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RecaudacionTest {

    Recaudacion recaudacion;

    @BeforeEach

    public void inicializarVariables() {
        try {
            recaudacion = new Recaudacion(new LectorCSV("src/main/resources/data.csv"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testWhereGivenCompany() throws IOException {
        var resultado = recaudacion
                .filtrarPor(Recaudacion.COMPANY_NAME, "Facebook")
                .ejecturarQuery();
        assertEquals(resultado.size(), 7);
    }

    @Test
    public void testWhereGivenCity() throws IOException {
        var resultado = recaudacion
                .filtrarPor(Recaudacion.CITY, "Tempe")
                .ejecturarQuery();
        assertEquals(resultado.size(), 3);
    }

    @Test
    public void testWhereGivenState() throws IOException {
        var resultado = recaudacion
                .filtrarPor(Recaudacion.STATE, "CA")
                .ejecturarQuery();
        assertEquals(resultado.size(), 873);
    }

    @Test
    public void testWhereGivenRound() throws IOException {
        var resultado = recaudacion
                .filtrarPor(Recaudacion.ROUND, "a")
                .ejecturarQuery();
        assertEquals(resultado.size(), 582);
    }

    @Test
    public void testMultipleOptions() throws IOException {
        var resultado = recaudacion.filtrarPor("round", "a")
                .filtrarPor("company_name", "Facebook")
                .ejecturarQuery();
        assertEquals(resultado.size(), 1);
    }


    @Test
    public void testWhereNotExists() throws IOException {
        var resultado = recaudacion
                .filtrarPor(Recaudacion.COMPANY_NAME, "NotFacebook")
                .ejecturarQuery();

        assertEquals(resultado.size(), 0);
    }

    @Test
    public void testWhereCorrectKeys() throws IOException {
        Map<String, String> row = recaudacion
                .filtrarPor(Recaudacion.COMPANY_NAME, "Facebook")
                .ejecturarQuery().get(0);
        assertEquals(row.get("permalink"), "facebook");
        assertEquals(row.get("company_name"), "Facebook");
        assertEquals(row.get("number_employees"), "450");
        assertEquals(row.get("category"), "web");
        assertEquals(row.get("city"), "Palo Alto");
        assertEquals(row.get("state"), "CA");
        assertEquals(row.get("funded_date"), "1-Sep-04");
        assertEquals(row.get("raised_amount"), "500000");
        assertEquals(row.get("round"), "angel");

    }
}
