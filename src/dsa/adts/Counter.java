package dsa.adts;

public class Counter {
    private String id;
    private int value;

    public Counter(String id) {
        this.id = id;
    }

    public void increment() {
        this.value++;
    }

    public int tally() {
        return this.value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "id='" + id + '\'' +
                ", value=" + value +
                '}';
    }
}
