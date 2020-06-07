import java.util.HashMap;
import java.util.Map;

// with map, we avoid to modify the code
// but we still can add new strategy
// also without if and else
public class TaxStrategyMapFactory {
    static Map<TaxType, TaxStrategy> map = new HashMap<>();

    static {
        map.put(TaxType.INTER_TAX, new InterTaxStrategy());
        map.put(TaxType.OUTER_TAX, new OuterTaxStrategy());
    }

    // open-close principle
    // but in this case, if we wanna to add a new strategy,
    // we still need to invoke this method, can we make it automatic?
    public static void registerTaxStrategy(TaxType taxType, TaxStrategy taxStrategy) {
        map.put(taxType, taxStrategy);
    }

    // in this case we don't need to modify this method
    public static TaxStrategy getTaxStrategy(TaxType taxType) throws Exception {
        if (map.containsKey(taxType))
            return map.get(taxType);
        else
            throw new Exception("The tax type is not supported.");
    }
}
