package oop.mostra_provimi.detyra6_7_8;

public abstract class Laptop implements Switchable{
    private String brand;
    private String model;
    private int ram;
    private int ram2;
    private int cpu;
    private int storage;

    private boolean on;

    public Laptop(String brand, String model, int ram, int ram2, int cpu, int storage) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.ram2 = ram2;
        this.cpu = cpu;
        this.storage = storage;
    }

    public Laptop() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRam2() {
        return ram2;
    }

    public void setRam2(int ram2) {
        this.ram2 = ram2;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", ram2=" + ram2 +
                ", cpu=" + cpu +
                ", storage=" + storage +
                '}';
    }

    @Override
    public void switchOn() {
        if(on) {
            throw new RuntimeException("Laptop is already on");
        }
        on = true;
        System.out.println("Laptop is swithcing on;");
    }

    @Override
    public void switchOff()  throws LaptopException{
        if(!on) {
            throw new LaptopException("Laptop is already off");
        }
        on = false;
        System.out.println("Laptop is swithcing off;");
    }
}