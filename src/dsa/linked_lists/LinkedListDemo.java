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

        list.appendFirst(new int[]{-2, -1, 0});
        list.appendLast(new int[]{1000, 2000, 3000});
        System.out.println("Size => " + list.size());
        list.addAfterIndex(5, 9999);
        list.removeByIndex(6);
//        list.removeFirst();
//        list.removeFirst();
//        list.removeLast();
//        list.removeLast();

        list.printList();
        System.out.println("PROVO PRAP");
        list.printList();

        int[] array = list.toArray();

    }
}
