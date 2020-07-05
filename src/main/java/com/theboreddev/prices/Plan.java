package com.theboreddev.prices;

import java.math.BigDecimal;
import java.util.function.Function;

public enum Plan {
    BASIC(deliveryPriceWithPercentageSurplus("0.025")),
    PREMIUM(deliveryPriceWithPercentageSurplus("0.015")),
    BUSINESS(deliveryPriceWithPercentageSurplus("0.0"));

    private static Function<Item, BigDecimal> deliveryPriceWithPercentageSurplus(String percentageSurplus) {
        return item -> item.price().multiply(new BigDecimal(percentageSurplus)).add(new BigDecimal("1.0"));
    }

    public final Function<Item, BigDecimal> deliveryPrice;

    Plan(Function<Item, BigDecimal> deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }
}

