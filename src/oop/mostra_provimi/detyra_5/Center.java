package oop.mostra_provimi.detyra_5;

public class Center {
    private String name;
    private String address;
    private String city;
    private int totalProduction;

    public Center(String name, String address, String city, int totalProduction) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.totalProduction = totalProduction;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getTotalProduction() {
        return totalProduction;
    }

    public void setTotalProduction(int totalProduction) {
        this.totalProduction = totalProduction;
    }

    @Override
    public String toString() {
        return "Center{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", totalProduction=" + totalProduction +
                '}';
    }
}
