package oop.generics;

public class KeyPairValueDemo {
    public static void main(String[] args) {
        KeyPairValue<String, Integer> titujt = new KeyPairValue<>("Real Madrid", 14);
        String key = titujt.getKey();
//        int k = titujt.getKey();
    }
}
