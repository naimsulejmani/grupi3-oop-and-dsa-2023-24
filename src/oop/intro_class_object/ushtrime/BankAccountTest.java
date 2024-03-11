package oop.intro_class_object.ushtrime;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("Profa", 2_000_000);
        ba1.withdrawal(5000000);
        ba1.deposit(-1000000);
        ba1.deposit(100);
        ba1.withdrawal(2000);
        ba1.withdrawal(23.33);
        System.out.println(ba1.getBalance());

        BankAccount ba2 = new BankAccount();
        ba2.setName("Studenti");
        ba2.withdrawal(100);
        ba2.deposit(100);
        ba2.withdrawal(20);
        System.out.println(ba2.getBalance());

    }
}







