package oop.mostra_provimi;

public class LaptopMain {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("Lenovo", "X1 Carbon", 16, 3500, 512);
        l1.setRam2(16);
        l1.setStorage("512");
        l1.setStorage(1f);
        System.out.println(l1.toString());
        l1.setRam(3);

        int y = 9;
        int x = 11;
        y += -x + 1;
        System.out.println(y--);
        System.out.println(y--);
        System.out.println(--y);

    }
}
