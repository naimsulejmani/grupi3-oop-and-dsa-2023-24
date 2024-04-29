package dsa.stacks;

public class Element<T> {
    private T element;
    private Element<T> next;

    public Element(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Element<T> getNext() {
        return next;
    }

    public void setNext(Element<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Element{" +
                "element=" + element +
                '}';
    }
}
