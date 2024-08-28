package hw3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class MyArrayList<T> implements MyList<T>{

    private static final int DEFAULT_CAPACITY = 10; // дефотный размер массива
    private static final int GROW_CAPACITY = 5; // дефотный размер массива
    private T[] elements; // массив объектов
    private int size = 0;

    public MyArrayList() {
        elements = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        elements = (T[]) new Object[capacity];
    }

    public MyArrayList(Collection<? extends T> c) {
        elements = (T[]) new Object[c.size()];
        addAll(c);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void add(T t) {
        if (size == elements.length){
            growArray();
        }
        elements[size] = t;
        size++;
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return elements[index];
    }

    @Override
    public T remove(int index) {
        checkIndex(index);
        T removedElement = elements[index];
        removeElementByIndex(index);
        return removedElement;
    }

    @Override
    public boolean remove(Object o) {
        T element = (T) o;
        for (int i = 0; i < size; i++) {
            if (elements[i] == element){
                removeElementByIndex(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public void addAll(Collection<? extends T> c) {
        T[] array = (T[]) c.toArray();
        if (size + array.length > elements.length){
            growArray(size + array.length);
        }
        System.arraycopy(array, 0, elements, size, array.length);
        size += array.length;
    }

    @Override
    public void set(int index, T t) {
        checkIndex(index);
        elements[index] = t;
    }

    /**
     * Увеличивает размер массива на GROW_CAPACITY
     * Никак не затрагивает size
     */
    private void growArray(){
        elements = Arrays.copyOf(elements, elements.length + GROW_CAPACITY);
    }

    private void growArray(int newLength){
        elements = Arrays.copyOf(elements, newLength);
    }

    /**
     * Проверка не выходит ли индекс за размер списка
     * @param index
     */
    private void checkIndex(int index){
        if (index >= size) throw new IndexOutOfBoundsException("Выход за размер списка");
    }

    /**
     * Удаление элемента из массива по индексу.
     * Упорядочивает элементы после удаления
     * Уменьшает size на 1
     * @param index
     */
    private void removeElementByIndex(int index){
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < size; i++){
            str.append(elements[i]);
            str.append(", ");
        }
        return str.substring(0, str.length() - 2).toString();
    }

}
