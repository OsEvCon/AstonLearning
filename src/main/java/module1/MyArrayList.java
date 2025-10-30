package module1;

import java.util.Collection;

public class MyArrayList <T> {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList(){
        elements = new Object[10];
    }

    public MyArrayList(int capacity){
        elements = new Object[capacity];
    }

    public boolean add(T element){
        if (size == elements.length){
            resize(elements.length * 2);
        }
            elements[size] = element;
            size++;
            return true;
    }

    public T get(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }

        return (T) elements[index];
    }

    public T remove(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }

        T element = (T) elements[index];

        for (int i = index; i < size - 1; i++){
                elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }

    public boolean addAll(Collection<? extends T> collection){
        if (collection != null){
            int needCapacity = size + collection.size();
            if (elements.length < needCapacity){
                resize(needCapacity);
            }

            for (T element : collection){
                add(element);
            }
            return true;
        }
        return false;
    }

    private void resize(int neededSize){
        Object[] newElements = new Object[neededSize];

        for (int i = 0; i < size; i++){
            newElements[i] = elements[i];
        }

        elements = newElements;
    }

    public int getSize() {
        return size;
    }
}
