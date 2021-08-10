package exercise.arraylist_of_library;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        this.size = 0;
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int size) {
        this.size = size;
        this.elements = new Object[this.size];
    }

    public void set(int index, E e){
        if (index>=0 && index <=elements.length){
            elements[index] = e;
        }else
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + elements.length );
    }

    private void ensureCapa() {
        int newSize = elements.length +1;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add1(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public void add(int index, E e) {
        this.add1(this.get(elements.length-1));
        if (index >=0 && index<=elements.length-1){
            for (int i = elements.length-2; i >index; i--) {
                this.set(i, this.get(i-1));
            }
            this.set(index,e);
        }else
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + elements.length );
    }

    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

    public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(elements[i]))
                return true;
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(elements[i])) return i;
        return -1;
    }

    public int size(){
        return this.size;
    }

    public void ensureCapacity(int minCapacity) {
        elements = Arrays.copyOf(elements, minCapacity);
    }

    public boolean add(E element){
        try {
            if (size == elements.length) {
                ensureCapa();
            }
            elements[size++] = element;
        } catch (Exception e){
            return false;
        }
        return true;
    }

    public E remove(int index) {
        for (int j = index; j < size - 1; j++)
            elements[j] = elements[j + 1];

        elements[size - 1] = null; // This element is now null

        // Decrement size
        size--;
        return (E) elements;
    }

    public MyList clone() {
        MyList<E> clone = new MyList<>(0);
        for (Object elements : elements) {
            clone.add((E) elements);
        }

        clone.size  = clone.size-1;
        return clone;
    }

}
