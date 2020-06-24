private int size = 0;
private Node <T> head = null; // linked list is empty
private Node <T> tail = null;

// internal node class to represent data

private class Node <T> {
    T data;
    Node <T> prev, next;
    public Node(T data, Node <T> prev, Node <T> next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
    @Override public String toString() {
        return data.toString();
    }
}