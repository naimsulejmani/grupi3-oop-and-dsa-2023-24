package dsa.adts;

import java.time.LocalDate;

public class Transaction implements Comparable<Transaction> {
    private String who;
    private LocalDate when;
    private double amount;

    public Transaction(String who, LocalDate when, double amount) {
        this.who = who;
        this.when = when;
        this.amount = amount;
    }

    public Transaction(String transaction) {
        // Naim Sulejmani,2024-04-08,300
        String[] tokens = transaction.split(";");
        if(tokens.length!=3) {
            System.out.println("Invalid string transaction!");
        } else {
            this.who = tokens[0];
            this.when = LocalDate.parse(tokens[1]);
            this.amount = Double.parseDouble(tokens[2]);
        }

    }

    public String who() {
        return who;
    }

    public LocalDate date() {
        return when;
    }

    public double amount() {
        return amount;
    }

    @Override
    public int compareTo(Transaction other) {
//        if(this.amount<other.amount) return -1;
//        else if(this.amount>other.amount) return 1;
//        //<0 isntaca me e vogel se other
//        //=0 te bartabte
//        //>0 kur this(instance) eshte me e madhe se other
//        return 0;

        return Double.compare(this.amount, other.amount);
    }

    // Naim Sulejmani,2024-04-08,300
    //

    @Override
    public String toString() {
        return String.format("%s;%s;%s", who, when, amount);
    }
}
