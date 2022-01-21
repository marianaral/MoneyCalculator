package MoneyCalculator;


import Controller.Controller;
import Model.Currency;
import Persistance.CurrencyLoader;
import Persistance.File.FileCurrencyLoader;
import Persistance.RateLoader;
import Persistance.Web.WebRateLoader;
import View.Dialog;
import View.Display;
import View.Swing.Swing;
import java.util.List;

public class Main {
    //https://cdn.jsdelivr.net/gh/fawazahmed0/currency-api@1/latest/currencies/from/to.json

    public static void main(String[] args) {
        CurrencyLoader currencyLoader = new FileCurrencyLoader("currenciesFile.txt");
        List<Currency> currencies = currencyLoader.load();
        RateLoader rateLoader = new WebRateLoader(
                "https://cdn.jsdelivr.net/gh/fawazahmed0/currency-api@1/latest"
                        + "/currencies/", "/");
        /*RateLoader rateLoader = new FileRateLoader("exchangeRateFile.csv");*/
        
        Swing ui = new Swing(currencies,rateLoader);
        ui.setVisible(true);
    }
}
