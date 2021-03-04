package _10_dsa_list.exercises;

public interface MyList<E> extends Iterable<E> {

    void add(E value);

    void add(E value, int index);

    E remove(int index);

    E get(int index);

    E set(E value, int index);

    void clear();

    Object clone();

    int size();

    boolean isEmpty();

    boolean contains(E value);

    int indexOf(E value);

    int lastIndexOf(E value);

    String toString();

    <E> E removeFirst();
}
