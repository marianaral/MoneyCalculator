package Model;

public class ExchangeRate {
    private final Currency from, to;
    private final Double rate;

    public ExchangeRate(Currency from, Currency to, Double rate) {
        this.from = from;
        this.to = to;
        this.rate = rate;
    }

    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public Double getRate() {
        return rate;
    }
    
    
}
