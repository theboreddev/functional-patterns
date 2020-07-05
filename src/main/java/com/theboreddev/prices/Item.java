package com.theboreddev.prices;

import java.math.BigDecimal;

public class Item {
    private final long id;
    private final BigDecimal price;

    public Item(long id, BigDecimal price) {
        this.id = id;
        this.price = price;
    }

    public long id() {
        return id;
    }

    public BigDecimal price() {
        return price;
    }
}
