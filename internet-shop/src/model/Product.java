package model;

import java.math.BigDecimal;

public class Product {
    private int id;
    private String name;
    private BigDecimal price;
    private static int availableAmount;

    public Product(int id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s %f %d", name, price,availableAmount);
    }
}
