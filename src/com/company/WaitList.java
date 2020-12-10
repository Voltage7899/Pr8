package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

 class WaitList<E> implements IWaitList{
    protected ConcurrentLinkedQueue<E> link=new ConcurrentLinkedQueue<>();
    public WaitList()
    {

    }
   public WaitList( E e)
    {

    }
    public String toString()
    {
        return "Info"+link;
    }


     @Override
     public void add(Object o) {
         link.add((E) o);
     }

     @Override
     public void remove(Object o) {
         link.remove((E)o);
     }

     @Override
     public boolean contains(Object o) {
         return false;
     }

     @Override
     public boolean containsAll(Object o) {
         return false;
     }

     @Override
     public boolean isEmpty() {
         return false;
     }
 }
