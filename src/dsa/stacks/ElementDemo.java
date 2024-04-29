package dsa.stacks;

public class ElementDemo {
    public static void main(String[] args) {
        Element<String> elementString = new Element<>("Hello");
        Element<Integer> integerElement = new Element<>(10);
        String emri = elementString.getElement();
        elementString.setElement(emri);
    }
}
