package oop.interfaces;

import java.time.LocalDate;
import java.time.Period;

public class Test {
    public static void main(String[] args) {
        LocalDate birthdate = LocalDate.of(2005, 10, 20);
        Period period = Period.between(birthdate, LocalDate.now());
        System.out.println("Years=" + period.getYears());
        System.out.println("Months=" + period.getMonths());
        System.out.println("Days=" + period.getDays());
    }
}
