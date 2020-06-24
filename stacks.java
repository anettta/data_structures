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