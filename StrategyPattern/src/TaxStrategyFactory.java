public class TaxStrategyFactory {
    // original strategy with if-else
    // in this case, if we wanna to add a new strategy, we should add if-else judgement.
    public static TaxStrategy getTaxStrategy(TaxType taxType) throws Exception {
        if (taxType == TaxType.INTER_TAX) {
            return new InterTaxStrategy();
        } else if (taxType == TaxType.OUTER_TAX)
            return new OuterTaxStrategy();
        else
            throw new Exception("This type of taxStrategy doesn't exist");
    }

    // use map to replace if

}
