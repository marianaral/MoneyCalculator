package Persistance.File;

import Model.Currency;
import Model.ExchangeRate;
import Persistance.RateLoader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRateLoader implements RateLoader{
    private final String name;

    public FileRateLoader(String name) {
        this.name = name;
    }
    
    @Override
    public ExchangeRate load(Currency from, Currency to) {
        try {
            double fromUSD = 0;
            double toUSD = 0;
            
            BufferedReader reader = new BufferedReader(new FileReader(this.name));
            while (true) {
                String line = reader.readLine();
                if (line == null) break;
                String[] splited = line.split(",");
                if (splited.equals(from.getCode())) {
                    fromUSD=Double.parseDouble(splited[1]);
                }
                if (splited[0].equals(to.getCode())) {
                    toUSD=Double.parseDouble(splited[1]);
                }
            }
            return new ExchangeRate(from, to, toUSD/fromUSD);
            
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR: FileRateLoader::load "
                    + "FileNotFoundException" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("ERROR: FileRateLoader::load IOException" 
                    + ex.getMessage());
        }
        
        
        return new ExchangeRate(from, to, 1.0);
    }
    
}
