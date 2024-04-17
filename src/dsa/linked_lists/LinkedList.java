package dsa.linked_lists;

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int data) {
        //1. Krijo nyjen e re me te dhenen (data)
        Node newNode = new Node(data);
        //2. Nyja e re dergon tek headi aktual
        newNode.setNext(head);
        //3. Head eshte nyja e re tash e tutje
        head = newNode;
        size++;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }


    public void addLast(int data) {
        //1. krijo nyjen
        Node newNode = new Node(data);

        //2. kontrollo a ki elemente
        if (isEmpty()) {
            head = newNode;
            //addFirst(newNode);
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            head = head.getNext();
            size--;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else if (size == 1) {
            head = null;
            size--;
            //removeFirst();
        } else {
            Node current = head;

            while (current.getNext().getNext() != null) {
                current = current.getNext();
            }
            current.setNext(null);
            size--;
        }
    }

    /*
        addAfterIndex(index, data)
        removeIndex(index)
        findPrevious(node)
        findAll()
        findFirst();
        findLast();
        findByIndex(index);
        toArray() => int[]
        toNodeArray() => Node[]
        LinkedList(int[] array)
        append(int[] array)
     */


}
