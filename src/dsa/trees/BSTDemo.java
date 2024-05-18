package dsa.trees;

public class BSTDemo {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(20);
        bst.insert(10);
        bst.insert(30);
        bst.insert(15);
        bst.insert(35);
        bst.insert(25);
        bst.insert(5);
        System.out.println("IN ORDER TRAVERSAL");
        bst.inOrderTraversal();
        System.out.println("PRE ORDER TRAVERSAL");
        bst.preOrderTraversal();
        System.out.println("POST ORDER TRAVERSAL");
        bst.postOrderTraversal();

        System.out.println("Minimal Node = " + bst.minimal());
        System.out.println("Maximal Node = " + bst.maximal());
        System.out.println("Exist node 25 = " + bst.contains(25));
        System.out.println("Exists node 40 = " + bst.contains(40));
    }
}
