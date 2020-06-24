public class Stack <T> implements Iterable <T> {
    private java.util.LinkedList <T> list = new java.util.LinkedList <T>();

    // create an empty stack
    public Stack() { }
}

// Create a Stack with an initial element
public Stack (T firstElem) {
    push(firstElem);
}

// return the number of elements in the stack
public int size() {
    return list.size();
}

// check if the stack is empty
public boolean isEmpty() {
    return size() == 0;
}

// push an element on the stack
public void push(T elem) {
    list.addLast(elem);
}

// pop an element off the stack
// throws an error if the stack is empty
public T pop() {
    if (isEmpty())
    throw new java.util.EmptyStackException();
    return list.removeLast();
}

