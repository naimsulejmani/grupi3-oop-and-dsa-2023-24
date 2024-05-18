package oop.polymorphism.db_example;

public class Demo {
    public static void main(String[] args) {
        Customer customer = new Customer(
                1,"Profa Academy","online","online","ilegal");
        // e kemi kriju nje objekt ne memorien heap

        // duhet me ja dergu databazes qe me regjistru
        // insert into customers (id, companyName, address, city, fiscalNo)
        // values (1,'Profa Academy','online','online','ilegal');
    }
}
