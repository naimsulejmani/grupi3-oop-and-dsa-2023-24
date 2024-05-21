package dsa.hashing;

import java.time.LocalDate;
import java.util.Objects;

public class Transaction {
    private String who;
    private LocalDate when;
    private double amount;

    public Transaction() {
    }

    public Transaction(String who, LocalDate when, double amount) {
        this.who = who;
        this.when = when;
        this.amount = amount;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public LocalDate getWhen() {
        return when;
    }

    public void setWhen(LocalDate when) {
        this.when = when;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "who='" + who + '\'' +
                ", when=" + when +
                ", amount=" + amount +
                '}';
    }

    @Override
    public int hashCode() {

        //31 * x + y
        int hash = 17;
        hash = 31 * hash + (who == null ? 0 : who.hashCode());
        hash = 31 * hash + when.hashCode();
        hash = 31 * hash + Double.valueOf(amount).hashCode();

        return hash;
    }
}







