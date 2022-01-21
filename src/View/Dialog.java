package View;

import Model.Currency;
import Model.Money;

public interface Dialog {
    
    Money getAmount();
    Currency getFrom();
    Currency getTo();
}
