package _10_dsa_list.exercises;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayMyList<E> implements MyList<E>, Iterable<E> {
    private E[] array;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private Object[] data;

    public MyArrayMyList() {
        array = (E[]) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void add(E value) {
        ensureCapacity();
        array[size] = value;
        size++;
    }

    @Override
    public void add(E value, int index) {
        if (index == size) {
            add(value);
            return;
        }
        checkIndex(index);
        ensureCapacity();
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = value;
        size++;
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        E value = array[index];
        if (index < size) {
            System.arraycopy(array, index + 1, array, index, size - index - 1);
        }
        array[size - 1] = null;
        size--;
        return value;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return array[index];
    }

    @Override
    public E set(E value, int index) {
        checkIndex(index);
        array[index] = value;
        return array[index];
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    @Override
    public Object clone() {
        Object[] arrayList = new Object[0];
        for (int i = 0; i < size; i++) {
            arrayList[i] = data[i];
        }
        return arrayList;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(E value) {
        return indexOf(value) >= 0;
    }

    @Override
    public int indexOf(E value) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E value) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public void checkIndex(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    private void ensureCapacity() {
        if (size == array.length) {
            E[] newArray = (E[]) new Object[array.length * 3 / 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }

    @Override
    public <E1> E1 removeFirst() {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    public void add(int i, E a) {
    }


    private class MyIterator implements Iterator {
        int i = 0;

        @Override
        public boolean hasNext() {
            if (size == 0 || i >= size) {
                return false;
            }
            return true;
        }

        @Override
        public E next() {
            return array[i++];
        }
    }
}
