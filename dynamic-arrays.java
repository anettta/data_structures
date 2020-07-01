private T [] arr; // internal static array
private int len = 0; // the length user thinks array is
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

public void clear() { // clear function
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

// removes the element at the specified index in this list
public T removeAt(int rm_index) {
    if (rm_index >= len && rm_index < 0) throw new IndexOutOfBoundsException();
    T data = arr[rm_index];
    T[] new_arr = (T[]) new Object[len-1]; // new array
    for (int i=0; j=0; i<len; i++; j++)
    if (i == rm_index) j--;
    else new_arr[j] = arr[i];
    arr = new_arr;
    return data;
}

public boolean remove(Object obj) {
    for (int i = 0; i < len; i++) {
        if (arr[i].equals(obj)) {
            removeAt(i); return true; 
          
        }
    }
    return false;
}

public int indexOf(Object obj) {
    for (int i = 0; i < len; i++)
    if (arr[i].equals(obj))
    return i;
    return -1;
}

public boolean contains(Object obj) {
    return indexOf(obj) != -1;
}

// iterator is still fast but not as fast as iterative for loop
@Override public java.util.Iterator <T> iterator () {
    return new java.util.Iterator <T> () {
        int index = 0;
        public boolean hasNext() { return index < len; }
        public T next() { return arr[index+++]; }

    };
}

@Override public String toString() {
    if (len == 0) return "[]";
    else {
        StringBuilder sb = new StringBuilder( len ).append("[");
        for (int i = 0; i < len-1; i++ )
        sb.append(arr[i] + ", ");
        return sb.append(arr[len-1] + "]").toString();
    }
}