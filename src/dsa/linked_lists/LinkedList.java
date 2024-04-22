package dsa.linked_lists;

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
    }

    public LinkedList(int[] array) {
        appendFirst(array);
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

    private Integer findByIndex(int index) {
        if (isEmpty()) {
            System.out.println("List is empty");
            return null;
        } else if (index < 0 || index >= size) {
            System.out.println("out of bounds");
            return null;
        }
        return findNodeByIndex(index).getData();
    }

    private Node findNodeByIndex(int index) {
        if (isEmpty()) {
            System.out.println("List is empty");
            return null;
        } else if (index < 0 || index >= size) {
            System.out.println("out of bounds");
            return null;
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            return current;
        }
    }

    public void addAfterIndex(int index, int data) {
        if (index < 0 || index >= size) {
            System.out.println("Out of bounds");
        } else if (index == 0) {
            addFirst(data);
        } else if (index == size - 1) {
            addLast(data);
        } else {
            Node newNode = new Node(data);
            Node current = findNodeByIndex(index);
            newNode.setNext(current.getNext());
            current.setNext(newNode);
            size++;
        }
    }

    public void removeByIndex(int index) {
        if (isEmpty()) {
            System.out.println("List is empty!");
        } else if (index < 0 || index >= size) {
            System.out.println("Out of bounds");
        } else if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node current = findNodeByIndex(index - 1);
//            Node next = current.getNext();
            current.setNext(current.getNext().getNext());
//            next.setNext(null);
            size--;
        }
    }

    public Integer findFirst() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return null;
        }
        return head.getData();
        //return findNodeByIndex(0).getData();
    }

    public Integer findLast() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return null;
        }
        return findNodeByIndex(size - 1).getData();
    }

    public int[] toArray() {
        int[] array = new int[size];
        Node current = head;
        for (int i = 0; i < size; i++) {
            array[i] = current.getData();
            current = current.getNext();
        }
        return array;
    }

    private Node[] toNodeArray() {
        Node[] array = new Node[size];
        Node current = head;
        for (int i = 0; i < size; i++) {
            array[i] = current;
            current = current.getNext();
        }
        return array;
    }

    public void appendLast(int[] array) {
        for (int number : array) {
            addLast(number);
        }
    }

    public void appendFirst(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            addFirst(array[i]);
        }
    }


    /*
        addAfterIndex(index, data)
        removeByIndex(index)
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
