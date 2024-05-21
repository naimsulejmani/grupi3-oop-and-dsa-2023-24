package dsa.hashing;

public class Main {
    public static void main(String[] args) {
        Buka buka = new Buka();
        System.out.println(buka.hashCode());
        System.out.println(Integer.toHexString(buka.hashCode()));
        System.out.println(buka.toString());

        Integer x = 10;
        System.out.println(x.hashCode());

        Boolean t1 = true;
        Boolean t2 = false;

        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());

        System.out.println("call".hashCode());
        System.out.println("Edin".hashCode());
        System.out.println("Ediniii".hashCode());
    }
}






















