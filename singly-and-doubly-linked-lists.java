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

// return the size of this linked list
public int size() {
    return size;
}

// is this linked list empty?
public boolean isEmpty() {
    return size() == 0;
}

// add an element to the tail of the linked list, O(1)
public void add(T elem) {
    addLast(elem);
}

// add an element to the beginning of this linked list, O(1)
public void addFirst(T elem) {
    // the linked list is empty
    if (isEmpty()) {
        head = tail = new Node <T> (elem, null, null);
    } else {
        head.prev = new Node <T> (elem, null, head);
        head = head.prev;
    }
    size++;
}

// add a node to the tail of the linked list, O(1)
public void addLast(T elem) {
    //the linked list is empty
    if (isEmpty()) {
        head = tail = new Node <T> (elem, null, null);
    } else {
        tail.next = new Node <T> ( elem, tail, null);
        tail = tail.next;
    }
    size++;
}