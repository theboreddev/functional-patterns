package com.theboreddev.prices;

public class PriceCalculatorFactory {

    public DeliveryPriceCalculator priceCalculatorFor(OldStylePlan plan) {
        if (plan.equals(OldStylePlan.BASIC)) {
            return new BasicDeliveryPriceCalculator();
        } else if (plan.equals(OldStylePlan.PREMIUM)) {
            return new PremiumDeliveryPriceCalculator();
        } else if (plan.equals(OldStylePlan.BUSINESS)) {
            return new BusinessDeliveryPriceCalculator();
        }
        throw new IllegalArgumentException("No support for plan " + plan);
    }
}
