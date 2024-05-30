package oop.generics;

public class NodeInt implements Comparable<NodeInt>{
    private int data;
    private NodeInt next;

    public NodeInt() {
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodeInt getNext() {
        return next;
    }

    public void setNext(NodeInt next) {
        this.next = next;
    }

    @Override
    public int compareTo(NodeInt o) {
        return 0;
    }
}
