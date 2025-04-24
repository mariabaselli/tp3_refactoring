package oop2.tp3.ejercicio2.polimorfico;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LectorCSV implements FuenteDeDatos {

    private String filePath;

    public LectorCSV(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public List<String[]> toList() throws IOException {
        List<String[]> csvData = new ArrayList<>();

        CSVReader reader = new CSVReader(new FileReader(filePath));
        String[] row = null;

        while ((row = reader.readNext()) != null) {
            csvData.add(row);
        }

        reader.close();
        csvData.remove(0);
        return csvData;
    }
}
