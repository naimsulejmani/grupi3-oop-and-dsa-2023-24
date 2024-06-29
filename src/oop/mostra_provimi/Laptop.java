package oop.mostra_provimi;

public class Laptop {
    private String brand;
    private String model;
    private int ram;
    private int ram2;
    private int cpu;
    private int storage;

    {
    }

    public Laptop(String brand, String model, int ram, int cpu, int storage) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.cpu = cpu;
        this.storage = storage;
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

        if (ram == 1 || ram == 2 || ram == 4 || ram == 8 || ram == 16 || ram == 32) {
            this.ram = ram;
        } else {
            throw new RuntimeException("Invalid ram");
        }

    }

    public int getRam2() {
        return ram2;
    }

    public void setRam2(int ram) {
        if (ram == 1 || ram == 2 || ram == 4 || ram == 8 || ram == 16 || ram == 32) {
            this.ram2 = ram;
        } else {
            throw new RuntimeException("Invalid ram");
        }
    }

    public int getTotalRam() {
        return ram + ram2;
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
        if (storage < 0) throw new RuntimeException("Invalid storage");
        this.storage = storage;
    }

    public void setStorage(float storage) {
        setStorage((int) storage);
    }

    public void setStorage(int storage, int storage2) {
        setStorage(storage + storage2);
    }

    public void setStorage(String storage) {
        setStorage(Integer.parseInt(storage));
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", cpu=" + cpu +
                ", storage=" + storage +
                '}';
    }


}
