package oop.mostra_provimi.detyra6_7_8;

public class LaptopMain {
    public static void main(String[] args) {
        Laptop l1 = new GamingLaptop("brand", "model", 32, 16, 4000, 1024, "nvidia");
        Laptop l2 = new WorkstationLaptop("brand", "12312", 16, 16, 512, 512, 8);

        l1.switchOn();
        System.out.println("---------------");
        try {
            l2.switchOff();
        } catch (LaptopException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("U kry finalja ktu mesazh");
        }
    }
}
