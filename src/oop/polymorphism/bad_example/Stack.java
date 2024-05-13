package oop.polymorphism.bad_example;

import java.util.ArrayList;

//bad example
public class Stack<T> extends ArrayList<T> {

    public void push(T item) {
        addLast(item);
    }

    public T pop() {
        return removeLast();
    }

    public T peek() {
        return getLast();
    }
}
