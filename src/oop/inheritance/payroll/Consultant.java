package oop.inheritance.payroll;

import java.time.LocalDate;

public class Consultant extends ContractEmployee {
    private double extraPay;

    public Consultant() {
    }

    public Consultant(int id, String name, String lastname, LocalDate birthdate, int hours, double hourlyRate, double extraPay) {
        super(id, name, lastname, birthdate, hours, hourlyRate);
        this.extraPay = extraPay;
    }

    public double getExtraPay() {
        return extraPay;
    }

    public void setExtraPay(double extraPay) {
        this.extraPay = extraPay;
    }

    @Override
    public double pay() {
        return super.pay() + extraPay;
//        return (getHourlyRate()+extraPay) * getHours();
    }

    @Override
    public String toString() {
        return String.format("""
                %s
                extraPay: %.2f
                position:Consultant
                """, super.toString(), extraPay);
    }
}








