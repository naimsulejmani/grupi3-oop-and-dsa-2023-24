package dsa.hashing;

import java.time.LocalDate;

public class TransactionDemo {
    public static void main(String[] args) {
        Transaction transaction = new Transaction("Naim Sulejmani Shkup", LocalDate.now(), 1_000_000);
        System.out.println(transaction.hashCode());
    }
}
