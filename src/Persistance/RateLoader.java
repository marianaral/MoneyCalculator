package Persistance;

import Model.Currency;
import Model.ExchangeRate;

public interface RateLoader {
    ExchangeRate load(Currency from, Currency to);
}
