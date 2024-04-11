package dsa.adts;

public class CounterDemo {
    public static void main(String[] args) {
        Counter adnani = new Counter("adnanis");
        Counter yllis = new Counter("yllis");

        adnani.increment();
        adnani.increment();

        yllis.increment();
        yllis.increment();
        yllis.increment();


        System.out.println(adnani);
        System.out.println(yllis);

        System.out.println(adnani.tally());


    }
}
