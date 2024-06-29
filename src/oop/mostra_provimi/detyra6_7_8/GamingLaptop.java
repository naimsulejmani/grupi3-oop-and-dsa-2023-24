package oop.mostra_provimi.detyra6_7_8;

public class GamingLaptop extends Laptop{
    private String gpu;

    public GamingLaptop(String brand, String model, int ram, int ram2, int cpu, int storage, String gpu) {
        super(brand, model, ram, ram2, cpu, storage);
        this.gpu = gpu;
    }

    public GamingLaptop(String gpu) {
        this.gpu = gpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    @Override
    public void switchOn() {
        super.switchOn();
        System.out.println("po dhezet shume shpejte!");
    }
}










