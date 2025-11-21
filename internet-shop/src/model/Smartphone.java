package model;

import java.math.BigDecimal;

public class Smartphone extends Product {
    private String color;
    private String batteryCapacity;
    private String camera;
    private String system;

    public Smartphone(int id, String name, BigDecimal price, String color, String batteryCapacity, String camera, String system) {
        super(id, name, price);
        this.color = color;
        this.batteryCapacity = batteryCapacity;
        this.camera = camera;
        this.system = system;
    }
}
