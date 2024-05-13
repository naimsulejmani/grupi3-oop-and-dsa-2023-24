package oop.polymorphism.good_example;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Barcelona");
        stack.push("Milan");
        stack.push("Real Madrid");

        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        //stack.addFirst("SMUNDEMI");
    }
}
