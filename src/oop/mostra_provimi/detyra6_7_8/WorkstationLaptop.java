package oop.mostra_provimi.detyra6_7_8;

public class WorkstationLaptop extends Laptop{
    private int cache;

    public WorkstationLaptop(String brand, String model, int ram, int ram2, int cpu, int storage, int cache) {
        super(brand, model, ram, ram2, cpu, storage);
        this.cache = cache;
    }

    public WorkstationLaptop(int cache) {
        this.cache = cache;
    }

    public int getCache() {
        return cache;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }
}
