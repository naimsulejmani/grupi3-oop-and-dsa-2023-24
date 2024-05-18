package oop.polymorphism.db_example;

import java.util.ArrayList;

// table Customers ne Microsoft SQL Server
public class Customer {
    private int id;
    private String companyName;
    private String address;
    private String city;
    private String fiscalNo;


    private ArrayList<Invoice> invoice;

    public Customer() {
    }

    public Customer(int id, String companyName, String address, String city, String fiscalNo) {
        this.id = id;
        this.companyName = companyName;
        this.address = address;
        this.city = city;
        this.fiscalNo = fiscalNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public String getFiscalNo() {
        return fiscalNo;
    }

    public void setFiscalNo(String fiscalNo) {
        this.fiscalNo = fiscalNo;
    }

    public ArrayList<Invoice> getInvoice() {
        return invoice;
    }

    public void setInvoice(ArrayList<Invoice> invoice) {
        this.invoice = invoice;
    }
}
