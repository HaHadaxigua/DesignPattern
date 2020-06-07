public interface TaxStrategy {
    double calculator(double amount);
}

class InterTaxStrategy implements TaxStrategy {

    @Override
    public double calculator(double amount) {
        final double taxRate = 0.2;
        return amount * taxRate;
    }
}

class OuterTaxStrategy implements TaxStrategy {

    @Override
    public double calculator(double amount) {
        final double taxRate = 0.2;
        return amount / (1 + taxRate) * taxRate;
    }
}

enum TaxType {
    OUTER_TAX, INTER_TAX;
}


