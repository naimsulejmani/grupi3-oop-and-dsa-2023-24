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

    public T minimal() {
        Node<T> minimalNode = minimal(root);
        if (minimalNode == null) return null;
        return minimalNode.getData();
    }

    private Node<T> minimal(Node<T> iter) {
        if (iter == null || iter.getLeft() == null)
            return iter;
        return minimal(iter.getLeft());
    }

    public T maximal() {
        Node<T> maximalNode = maximal(root);
        if (maximalNode == null) return null;
        return maximalNode.getData();
    }

    private Node<T> maximal(Node<T> iter) {
        if (iter == null || iter.getRight() == null)
            return iter;
        return maximal(iter.getRight());
    }

    private Node<T> treeSuccessor(Node<T> iter) {
        return maximal(iter.getLeft());
    }

    public boolean contains(T value) {
        Node<T> node = search(root, value);
        return node != null;
    }

    private Node<T> search(Node<T> iter, T value) {
        if (iter == null || iter.getData().compareTo(value) == 0)
            return iter;
        else if (iter.getData().compareTo(value) < 0)
            return search(iter.getRight(), value);
        else return search(iter.getLeft(), value);
    }


    public void remove(T value) {
        root = deleteNode(root, value);
    }

    private Node<T> deleteNode(Node<T> root, T value) {
        if (root == null) return null;
        if (value.compareTo(root.getData()) < 0) {
            root.setLeft(deleteNode(root.getLeft(), value));
        } else if (value.compareTo(root.getData()) > 0) {
            root.setRight(deleteNode(root.getRight(), value));
        } else {
            if (root.getLeft() == null) return root.getRight();
            else if (root.getRight() == null) return root.getLeft();

            root.setData(treeSuccessor(root).getData());

            root.setRight(deleteNode(root.getRight(), root.getData()));
        }
        return root;
    }




    /*
        minimal
        maximal
        search / exist
        treeSuccessor
        delete ?


     */
}







