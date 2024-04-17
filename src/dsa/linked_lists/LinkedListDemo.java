package dsa.linked_lists;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(100);
        list.addFirst(50);
        list.addFirst(20);

        list.addLast(400);
        list.addLast(500);
        list.addLast(1);

        list.removeFirst();
        list.removeFirst();
        list.removeLast();
        list.removeLast();

        list.printList();
        System.out.println("PROVO PRAP");
        list.printList();


    }
}
