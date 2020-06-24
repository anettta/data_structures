private T [] arr; // internal static array
private int len = 0; // length user thinks array is
private int capacity = 0; // actual array size

public Array() { // constructor
    this(16);
}

public Array(int capacity){ // constructor
    if (capacity < 0) throw new IllegalArgumentException("Illegal Capacity: " + capacity);
    this.capacity = capacity;
    arr = (T[]) new Object[capacity];
}

public int size() { return len; }
public boolean isEmpty() { return size() == 0; }

public T get(int index) { return arr[index]; } // bounce check needed
public void set(int index, T elem) { arr[index] = elem; } // bounce check needed

public void clear() {
    for(int i = 0; i < capacity; i++)
    arr[i] = null;
    len = 0;
}

public void add(T elem) {

    // Time to resize!
    if (len+1 >= capacity) {
        if (capacity == 0) capacity = 1;
        else capacity *= 2; // double the size
        T[] new_arr = (T[]) new Object[capacity];
        for (int i = 0; i < len; i++) // copy old values line 1
        new_arr[i] = arr[i]; // copy old values line 2
        arr = new_arr; // arr has extra nulls padded
    }
    arr[len++] = elem;


}

