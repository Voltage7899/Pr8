package com.company;

public class UnfairWaitList <E> extends WaitList{
    UnfairWaitList()
    {

    }

    void moveToBack(E e)
    {
        link.remove(e);
        link.add(e);
    }
}
