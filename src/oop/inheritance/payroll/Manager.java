package oop.inheritance.payroll;

import java.time.LocalDate;

public class Manager extends RegularEmployee{
    private float bonusPercent;

    public Manager() {
    }

    public Manager(int id, String name, String lastname, LocalDate birthdate, double salary, float bonusPercent) {
        super(id, name, lastname, birthdate, salary);
        this.bonusPercent = bonusPercent;
    }

    public float getBonusPercent() {
        return bonusPercent;
    }

    public void setBonusPercent(float bonusPercent) {
        this.bonusPercent = bonusPercent;
    }

    @Override
    public double pay() {
        return super.pay() * (1 + bonusPercent);
    }

    @Override
    public String toString() {
        return String.format("""
                %s
                bonusPercent: %.2f
                Position: Manager
                """,super.toString(),bonusPercent);
    }
}
