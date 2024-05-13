package oop.polymorphism.bad_example;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Real Madrid");
        stack.push("Man City");
        stack.push("Barcelona");
        stack.addFirst("BVB");

        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }
}
