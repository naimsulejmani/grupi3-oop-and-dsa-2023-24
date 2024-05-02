package dsa.queues;

//Kristofer Kolombo , tjeter kun u nis, tjeter kun ka mbri,
//kur u kthy ska dite ku ka qene
public class Queue<T> {
    private static final int MAX_SIZE = 100;
    private static final int SPECIAL_EMPTY_VALUE = -1;
    private Object[] array;
    private int head = SPECIAL_EMPTY_VALUE;
    private int tail = SPECIAL_EMPTY_VALUE;

    public Queue() {
        array = new Object[MAX_SIZE];
    }

    public boolean isEmpty() {
        return head == SPECIAL_EMPTY_VALUE;
    }

    public int size() {
        return tail >= head ? tail - head + 1 : MAX_SIZE - (head - tail - 1);
    }

    public boolean isFull() {
        //return size() == MAX_SIZE;
        return nextTail() == head;
    }

    private int nextTail() {
        return next(tail);
    }

    private int nextHead() {
        return next(head);
    }

    private int next(int index) {
        return (index + 1) % MAX_SIZE;
    }

    public void enqueue(T value) throws QueueException {
        if (isFull()) {
            throw new QueueException("Queue is full!");
        }
        tail = nextTail();
        array[tail] = value;
        if (head == SPECIAL_EMPTY_VALUE) {
            head = tail;
        }
    }

    public T dequeue() throws QueueException {
        T value = peek();
        array[head] = null;

        if (head == tail) {
            head = tail = SPECIAL_EMPTY_VALUE;
        } else {
            head = nextHead();
        }
        return value;
    }

    private T peek() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue is empty!");
        }
        return (T) array[head];
    }

    public boolean offer(T value) {
        try {
            enqueue(value);
            return true;
        } catch (QueueException e) {
            return false;
        }
    }

}
