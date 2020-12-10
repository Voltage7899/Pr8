package com.company;



public class BoundedWaitList<E> extends WaitList{
    private int capacity;
    BoundedWaitList(int capacity)
    {
        this.capacity=capacity;
    }
    int getCapacity()
    {
        return capacity;
    }

    public String toString()
    {
        return "Object is "+link;
    }
}
