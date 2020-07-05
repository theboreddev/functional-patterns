package com.theboreddev.prices;

import java.math.BigDecimal;

public class BusinessDeliveryPriceCalculator implements DeliveryPriceCalculator {
    @Override
    public BigDecimal priceFor(Item item) {
        return new BigDecimal("1.0");
    }
}

