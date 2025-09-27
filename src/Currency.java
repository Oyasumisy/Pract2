public class Currency {
    private String currencyCode;
    private String currencyName;
    private int decimalPlaces;
    private double minLimit;
    private double maxLimit;
    private double exchangeRate;

    public Currency() {}
    public Currency(String currencyCode, String currencyName, int decimalPlaces,
                    double minLimit, double maxLimit, double exchangeRate) {
        this.currencyCode = currencyCode;
        this.currencyName = currencyName;
        this.decimalPlaces = decimalPlaces;
        this.minLimit = minLimit;
        this.maxLimit = maxLimit;
        this.exchangeRate = exchangeRate;
    }

    public void setTransactionRules() {}
    public void performConversion() {}
    public void validateTransaction() {}

    public String getCurrencyCode() { return currencyCode; }
    public void setCurrencyCode(String currencyCode) { this.currencyCode = currencyCode; }

    public String getCurrencyName() { return currencyName; }
    public void setCurrencyName(String currencyName) { this.currencyName = currencyName; }

    public int getDecimalPlaces() { return decimalPlaces; }
    public void setDecimalPlaces(int decimalPlaces) { this.decimalPlaces = decimalPlaces; }

    public double getMinLimit() { return minLimit; }
    public void setMinLimit(double minLimit) { this.minLimit = minLimit; }

    public double getMaxLimit() { return maxLimit; }
    public void setMaxLimit(double maxLimit) { this.maxLimit = maxLimit; }

    public double getExchangeRate() { return exchangeRate; }
    public void setExchangeRate(double exchangeRate) { this.exchangeRate = exchangeRate; }

    @Override
    public String toString() {
        return "Currency{" +
                "currencyCode='" + currencyCode + '\'' +
                ", currencyName='" + currencyName + '\'' +
                ", decimalPlaces=" + decimalPlaces +
                ", minLimit=" + minLimit +
                ", maxLimit=" + maxLimit +
                ", exchangeRate=" + exchangeRate +
                '}';
    }
}