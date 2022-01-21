package Persistance.File;

import Model.Currency;
import Persistance.CurrencyLoader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileCurrencyLoader implements CurrencyLoader{
    private final String name;

    public FileCurrencyLoader(String name) {
        this.name = name;    }

    @Override
    public List<Currency> load() {
        List<Currency> currenciesList = new ArrayList<>();
        try{
             BufferedReader reader = new BufferedReader(new FileReader(this.name));
             while (true) {
                String line = reader.readLine();
                if (line == null)
                    break;
                currenciesList.add(currencyConverter(line));
            }
        } catch (FileNotFoundException ex) { 
            System.out.println("ERROR: FileCurrencyLoader::load "
                    + "FileNotFoundException" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("ERROR: FileCurrencyLoader::load IOException" 
                    + ex.getMessage());
        } 
        return currenciesList;
    }

    private Currency currencyConverter(String text) {
        String[] splitedText = text.split(",");
        return new Currency(splitedText[0], splitedText[1], splitedText[2]);
    }
    
    
}
