package ss10_List.excercise.e1;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        E[] elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E e) {
        for (int i = size; i >= index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = e;
        size++;
    }

    public E remove(int index) {
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return (E) elements;
    }

    public int size() {
        return size;
    }

    public Object[] clone() {
        Object clone[];
        clone = new Object[elements.length];
        clone = elements;
        return clone;
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        if (size != elements.length) {
            elements[size] = e;
            size++;
            return true;
        } else return false;
    }

    public void ensureCapacity(int minCapacity) {
        E[] newElements = (E[]) new Object[minCapacity];
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }

    public E get(int i) {
        return (E) elements[i];
    }

    public void clear() {
        E[] newElements = (E[]) new Object[elements.length];
        elements = newElements;
    }
}
