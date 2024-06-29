package oop.mostra_provimi.detyra_5;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private String address;
    private List<Center> centers;
    private Center[] centersArray;
    private int totalCenter;

    public Company(String name, String address, int totalCenter) {
        this.name = name;
        this.address = address;
        this.totalCenter = totalCenter;
        this.centers = new ArrayList<>();
        this.centersArray = new Center[totalCenter];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Center> getCenters() {
        return centers;
    }

    public void setCenters(List<Center> centers) {
        this.centers = centers;
    }

    public Center[] getCentersArray() {
        return centersArray;
    }

    public void setCentersArray(Center[] centersArray) {
        this.centersArray = centersArray;
    }

    public int getTotalCenter() {
        return totalCenter;
    }

    public void setTotalCenter(int totalCenter) {
        this.totalCenter = totalCenter;
    }

    public void addCenter(Center center) {
        if (centers.size() < totalCenter) {
            this.centers.add(center);
        } else {
            throw new RuntimeException("Too many centers");
        }
    }

    public int getTotalProduction() {
        int total = 0;
        for (Center center : centers) {
            total += center.getTotalProduction();
        }
        return total;
    }

    public static Center maxCenterWithProduction(Company... companies) {
        Center maxCenter = companies[0].centers.get(0);

        for (Company company : companies) {
            for (Center center : company.centers) {
                if (maxCenter.getTotalProduction() < center.getTotalProduction()) {
                    maxCenter = center;
                }
            }
        }
        return maxCenter;
    }

    public static int getTotalProductions(Company... companies) {
        int total = 0;
        for (Company company : companies) {
            total += company.getTotalProduction();
        }
        return total;
    }
}














