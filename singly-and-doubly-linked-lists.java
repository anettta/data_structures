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

// empty this linked list, O(n)

public void clear() {
    Node <T> trav = head;
    while(trav != null) {
        Node <T> next = trav.next;
        trav.prev = trav.next = null;
        trav.data = null;
        trav = next;
    }
    head = tail = trav = null;
    size = 0;
}