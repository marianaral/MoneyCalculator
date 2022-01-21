package Persistance.Web;

import Model.Currency;
import Persistance.CurrencyLoader;
import java.net.URL;
import java.util.List;


public class WebCurrencyLoader implements CurrencyLoader{

    private final String urlFrom;
    private final String urlTo;
    private URL fullUrl;

    public WebCurrencyLoader(String urlFrom, String urlTo) {
        this.urlFrom = urlFrom;
        this.urlTo = urlTo;
    }
    
    public Currency CurrencyFrom () {
        return null;
    }
    
    public Currency CurrencyTo () {
        return null;
    }
    
    
    @Override
    public List<Currency> load() {
        return null;
    }
    
}
