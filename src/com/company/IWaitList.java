package com.company;

public interface IWaitList<E> {
 void add(E e);
void remove(E e);
boolean contains(E e);
boolean containsAll(E e);
boolean isEmpty();

}
