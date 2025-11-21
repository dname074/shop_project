package model;

import java.math.BigDecimal;

public class Computer extends Product {
    private String ram;
    private String cpu;
    private String diskMemory;
    private String gpu;
    private String os;

    public Computer(int id, String name, BigDecimal price, String ram, String cpu, String diskMemory, String gpu, String os) {
        super(id, name, price);
        this.ram = ram;
        this.cpu = cpu;
        this.diskMemory = diskMemory;
        this.gpu = gpu;
        this.os = os;
    }
}
