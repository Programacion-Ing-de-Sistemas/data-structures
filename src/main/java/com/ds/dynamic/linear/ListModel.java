package com.ds.dynamic.linear;

public interface ListModel<T> {
    
    void addStart(T item);

    void addEnd(T item);

    void removeStart();

    void removeEnd();

    void remove(int position);

    T get(int position);

    void clear();

    boolean isEmpty();

    int size();

}
