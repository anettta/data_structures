public class Queue <T> implements Iterable <T> {
    private java.util.LinkedList <T> list = new java.util.LinkedList <T>();

public Queue() { } // empty queue

public Queue(T firstElem) {
    offer(firstElem);
}

// return the size of the queue
public int size() {
    return list.size();
}

// returns whether or not the queue is empty
public boolean isEmpty() {
    return size() == 0;
}

// peek the element  at the front of the queue
// the method throws an error if the queue is empty
public T peek() {
    if (isEmpty())
    throw new RuntimeException("Queue Empty");
    return list.peekFirst();
}

// poll an element from the front of the queue
// the method throws an error if the queue is empty
public T poll() {
    if (isEmpty())
    throw new RuntimeException("Queue Empty");
    return list.removeFirst();
}

// add an element to the back of the queue
public void offer(T elem) {
    list.addLast(elem);
}

// return an iterator to allow the user to traverse
// through the elements found inside the queue
@Override public java.util.Iterator <T> iterator () {
    return list.iterator();
}


}