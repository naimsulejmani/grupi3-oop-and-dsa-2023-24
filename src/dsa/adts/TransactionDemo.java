package dsa.adts;

import java.time.LocalDate;

public class TransactionDemo {
    public static void main(String[] args) {
        Transaction adnani = new Transaction(
                "Adnan Smajli", LocalDate.of(2024, 4, 8), 23.33);
        Transaction adonit = new Transaction("Adonit", LocalDate.now(), 300);
        Transaction ylli = new Transaction("Ylli;2023-01-01;200");

        System.out.println(adnani);
        System.out.println(adonit);
        System.out.println(ylli);

        System.out.println(ylli.compareTo(adonit));
        System.out.println(ylli.compareTo(adnani));
    }
}
