package dsa.linked_lists.doubly_linked_list;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {

    }

    public boolean isEmpty() {
        return size == 0; // head == null; // tail==null;
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);

            head = newNode;
        }
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);

            tail = newNode;
        }
        size++;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            //Node current = head;
            head = head.getNext();
            head.setPrev(null);
            //current.setNext(null);
            size--;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            tail = tail.getPrev();
            tail.setNext(null);
            size--;
        }
    }

    /*
        void findFirst();
        void findLast();
        void printAll();
        void printAllReverse();
        Node findNodeByIndex(int index);
        Integer findByIndex(int index);
        void addBeforeIndex(int index, int data);
        void addAfterIndex(int index, int data);
        void voidRemoveByIndex(int index);
        int[] toArray();
        Node[] toNodeArray();
        addLastAll(int[] data);
        addFirstAll(int[] data);
        LinkedList(int[] array);
        void addAfterIndex(int index, int[] array);
        void addBeforeIndex(int index, int[] array);
        boolean contains(int data);
        int indexOf(int data);
     */


}









