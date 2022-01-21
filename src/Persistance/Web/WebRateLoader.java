package Persistance.Web;

import Model.Currency;
import Model.ExchangeRate;
import Persistance.RateLoader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class WebRateLoader implements RateLoader{

    private final String urlFrom;
    private final String urlTo;
    private URL fullUrl;
    
//https://cdn.jsdelivr.net/gh/fawazahmed0/currency-api@1/latest/currencies/from/to.json
    public WebRateLoader(String urlFrom, String urlTo) {
        this.urlFrom = urlFrom;
        this.urlTo = urlTo;
    }
    
    private Double getRate(Currency from, Currency to)   {
        try {
            this.fullUrl= new URL(this.urlFrom + from.getCode().toLowerCase() + this.urlTo + 
                    to.getCode().toLowerCase() + ".json");
        } catch (MalformedURLException ex) {
            System.out.println("ERROR: WebRateLoader::getRate "
                    + "MalformedURLException" + ex.getMessage());
        }
        String line = null;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    fullUrl.openStream()));
            
            while (true) {
                line = reader.readLine();
                if (line == null) break;
                if(line.contains(to.getCode().toLowerCase())) break;
            }
            
            reader.close();
            
        } catch (IOException ex) {
            System.out.println("ERROR: WebRateLoader::getRate "
                    + "IOException" + ex.getMessage());
        }
        return Double.parseDouble(line.split(": ")[1]);
    }
    
    @Override
    public ExchangeRate load(Currency from, Currency to) {
        return new ExchangeRate(from, to, getRate(from, to));
    }
    
}
