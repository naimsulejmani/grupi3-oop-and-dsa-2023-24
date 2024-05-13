package dsa.trees;

public class BinarySearchTree<T extends Comparable<T>> {
    private Node<T> root;
    private int size;

    public BinarySearchTree() {

    }

    public boolean isEmpty() {
        return root == null;
    }

    public int size() {
        return size;
    }

    public void insert(T value) {
        Node<T> newNode = new Node<>(value);

        if (isEmpty()) {
            root = newNode;
        } else {
            Node<T> iter = root;
            while (iter != null) {
                if (value.compareTo(iter.getData()) <= 0) {
                    if (iter.getLeft() == null) {
                        iter.setLeft(newNode);
                        break;
                    } else {
                        iter = iter.getLeft();
                    }
                } else {
                    if (iter.getRight() == null) {
                        iter.setRight(newNode);
                        break;
                    } else {
                        iter = iter.getRight();
                    }
                }
            }
        }
        size++;
    }

    public void inOrderTraversal() {
        //M Rr D
        inOrder(root);
    }

    private void inOrder(Node<T> iter) {
        if (iter == null) return;
        inOrder(iter.getLeft()); // M
        System.out.println(iter.getData()); // Rr
        inOrder(iter.getRight());
    }


    public void preOrderTraversal() {
        // Rr M D
        preOrder(root);
    }

    private void preOrder(Node<T> iter) {
        if (iter == null) return;
        System.out.println(iter.getData()); //Rr
        preOrder(iter.getLeft()); // M
        preOrder(iter.getRight()); // D
    }

    public void postOrderTraversal() {
        // M D Rr
        postOrder(root);
    }

    private void postOrder(Node<T> iter) {
        if (iter == null) return;
        postOrder(iter.getLeft()); // M
        postOrder(iter.getRight()); //D
        System.out.println(iter.getData()); //Rr
    }
}







