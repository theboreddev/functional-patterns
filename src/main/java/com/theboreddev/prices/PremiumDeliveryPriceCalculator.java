package com.theboreddev.prices;

import java.math.BigDecimal;

public class PremiumDeliveryPriceCalculator implements DeliveryPriceCalculator {
    @Override
    public BigDecimal priceFor(Item item) {
        return item.price().multiply(new BigDecimal("0.015")).add(new BigDecimal("1.0"));
    }
}
