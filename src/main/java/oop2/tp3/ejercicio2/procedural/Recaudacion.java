package oop2.tp3.ejercicio2.procedural;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Recaudacion {
    public static List<Map<String, String>> where(Map<String, String> options)
            throws IOException {
        List<String[]> csvData = new ArrayList<String[]>();
        CSVReader reader = new CSVReader(new FileReader("src/main/resources/data.csv"));
        String[] row = null;

        while ((row = reader.readNext()) != null) {
            csvData.add(row);
        }

        reader.close();
        csvData.remove(0);

        if (options.containsKey("company_name")) {
            List<String[]> results = new ArrayList<String[]>();

            for (int i = 0; i < csvData.size(); i++) {
                if (csvData.get(i)[1].equals(options.get("company_name"))) {
                    results.add(csvData.get(i));
                }
            }
            csvData = results;
        }

        if (options.containsKey("city")) {
            List<String[]> results = new ArrayList<String[]>();

            for (int i = 0; i < csvData.size(); i++) {
                if (csvData.get(i)[4].equals(options.get("city"))) {
                    results.add(csvData.get(i));
                }
            }
            csvData = results;
        }

        if (options.containsKey("state")) {
            List<String[]> results = new ArrayList<String[]>();

            for (int i = 0; i < csvData.size(); i++) {
                if (csvData.get(i)[5].equals(options.get("state"))) {
                    results.add(csvData.get(i));
                }
            }
            csvData = results;
        }

        if (options.containsKey("round")) {
            List<String[]> results = new ArrayList<String[]>();

            for (int i = 0; i < csvData.size(); i++) {
                if (csvData.get(i)[9].equals(options.get("round"))) {
                    results.add(csvData.get(i));
                }
            }
            csvData = results;
        }

        List<Map<String, String>> output = new ArrayList<Map<String, String>>();

        for (int i = 0; i < csvData.size(); i++) {
            Map<String, String> mapped = new HashMap<String, String>();
            mapped.put("permalink", csvData.get(i)[0]);
            mapped.put("company_name", csvData.get(i)[1]);
            mapped.put("number_employees", csvData.get(i)[2]);
            mapped.put("category", csvData.get(i)[3]);
            mapped.put("city", csvData.get(i)[4]);
            mapped.put("state", csvData.get(i)[5]);
            mapped.put("funded_date", csvData.get(i)[6]);
            mapped.put("raised_amount", csvData.get(i)[7]);
            mapped.put("raised_currency", csvData.get(i)[8]);
            mapped.put("round", csvData.get(i)[9]);
            output.add(mapped);
        }
        return output;
    }
}
