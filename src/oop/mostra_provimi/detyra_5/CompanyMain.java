package oop.mostra_provimi.detyra_5;

public class CompanyMain {
    public static void main(String[] args) {
        Center ac1 = new Center("AC1", "ADD1", "PR1", 1000);
        Center ac2 = new Center("AC2", "ADD2", "PR2", 2000);

        Company a = new Company("Kosmonte Foods", "PR1", 2);
        a.addCenter(ac1);
        a.addCenter(ac2);


        Center bc1 = new Center("BC1", "ADD1", "PZ1", 5000);
        Center bc2 = new Center("BC2", "ADD2", "PZ2", 12000);

        Company b = new Company("Elkos", "PZ1", 2);
        b.addCenter(bc1);
        b.addCenter(bc2);

        Center maxCenter = Company.maxCenterWithProduction(a, b);

        System.out.println(maxCenter);


        System.out.println(a.getTotalProduction());

        System.out.println(Company.getTotalProductions(a,b));
    }
}
