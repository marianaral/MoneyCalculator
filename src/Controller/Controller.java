package Controller;

import Model.Currency;
import Model.Money;
import Persistance.RateLoader;
import View.Dialog;
import View.Display;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Controller {

    private Display display;
    private RateLoader rateLoader;
    private Dialog  dialog;

    public Controller(Display display,RateLoader rateLoader, Dialog dialog) {
        this.display = display;
        this.rateLoader = rateLoader;
        this.dialog = dialog;
    }
   
    public void execute() {
        display.display(result(dialog.getAmount(), dialog.getFrom() ,dialog.getTo()));   
    }
    
    
    private Money result(Money money, Currency currencyFrom,Currency currencyTo){
        return new Money(money.getAmount() * rateLoader.load(currencyFrom, currencyTo).getRate(), currencyTo);
    }
    
   
    
}
