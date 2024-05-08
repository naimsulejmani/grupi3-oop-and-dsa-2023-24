package dsa.queues;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        queue.offer("ASdsadad");
        try {
            queue.enqueue("Ylli");
            queue.enqueue("Kreshniku");
            System.out.println(queue.dequeue());

        } catch (QueueException e) {
            System.out.println("Gabimi u trajtua me suksese!!!!");
            System.out.println(e.getMessage());
        }

    }
}
