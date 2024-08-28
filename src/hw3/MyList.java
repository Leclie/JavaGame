package hw3;

import java.util.Collection;

public interface MyList<T> {

    int getSize();

    void add(T t);

    T get(int index);

    T remove(int index);

    boolean remove(Object o );

    void addAll(Collection<? extends T> c);

    void set(int index, T t);

}
