package oop.generics;

public class KeyPairValue<K, V> {
    private K key;
    private V value;

    public KeyPairValue(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public int index(int length) {
        return (key.hashCode() & 0x7FFFFFFF) % length;
    }

    @Override
    public String toString() {
        return "KeyPairValue{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
