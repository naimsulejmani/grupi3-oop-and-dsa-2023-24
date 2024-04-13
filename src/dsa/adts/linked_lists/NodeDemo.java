package dsa.adts.linked_lists;

public class NodeDemo {
    public static void main(String[] args) {
        Node node1 = new Node(10);

        Node node2 = new Node(20);

        node1.setNext(node2);

        Node node3 = new Node(30);

        node2.setNext(node3);

        Node node25 = new Node(25);


        node25.setNext(node3);
        node2.setNext(node25);


        Node node0 = new Node(0);


        node0.setNext(node1);

        System.out.println(node1);
        System.out.println(node2);


    }
}
