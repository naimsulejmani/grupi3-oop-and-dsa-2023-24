package oop.polymorphism.good_example;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> elements = new ArrayList<>();

    public Stack() {

    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }

    public void push(T element) {
        elements.addLast(element);
    }

    public T pop() {
        return elements.removeLast();
    }

    public T peek() {
        return elements.getLast();
    }
}






