import java.text.DecimalFormat;
import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[]= new Object[DEFAULT_CAPACITY];

    public MyArrayList() {
        for(int i=0;i<elements.length;i++){
            add((E) elements[i]);
        }
    }

    public MyArrayList(int capacity) {

    }

    //Phương thức ensureCapacity
    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E element) {
        ensureCapacity();
        for (int i = index; i < size; i++)
            elements[i + 1] = elements[i];
        elements[index] = element;

        size++;
    }

    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return (E) elements[index];
    }

    public int size() {
        return size;
    }

    public E clone() {
        return (E) elements;
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) return true;
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) return i;
        }
        return -1;
    }

        public boolean add(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) return true;
        }
        return false;
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }
}
