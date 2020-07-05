package com.theboreddev.prices;

import java.math.BigDecimal;

public class DeliveryPriceCalculatorClient {

    public static void main(String[] args) {

        final PriceCalculatorFactory factory = new PriceCalculatorFactory();

        // Old style
        final Item newItem = new Item(1L, new BigDecimal("12.99"));
        final DeliveryPriceCalculator priceCalculator = factory.priceCalculatorFor(OldStylePlan.BASIC);
        System.out.println("Delivery price is " + priceCalculator.priceFor(newItem));

        //Functional style
        final Item item = new Item(1L, new BigDecimal("12.99"));
        System.out.println("Delivery price is " + Plan.BASIC.deliveryPrice.apply(newItem));
        System.out.println("Delivery price is " + Plan.PREMIUM.deliveryPrice.apply(newItem));
        System.out.println("Delivery price is " + Plan.BUSINESS.deliveryPrice.apply(newItem));

    }
}
