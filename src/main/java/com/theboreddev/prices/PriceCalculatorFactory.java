package com.theboreddev.prices;

public class PriceCalculatorFactory {

    public DeliveryPriceCalculator priceCalculatorFor(Plan plan) {
        if (plan.equals(Plan.BASIC)) {
            return new BasicDeliveryPriceCalculator();
        } else if (plan.equals(Plan.PREMIUM)) {
            return new PremiumDeliveryPriceCalculator();
        } else if (plan.equals(Plan.BUSINESS)) {
            return new BusinessDeliveryPriceCalculator();
        }
        throw new IllegalArgumentException("No support for plan " + plan);
    }
}
