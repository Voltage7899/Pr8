package com.company;

public class Main  {
    public static void main(String [] args)
    {
BoundedWaitList<Integer>list1=new BoundedWaitList<>(5);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1);
        System.out.println(list1.getCapacity());
        UnfairWaitList<Integer>list2=new UnfairWaitList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        System.out.println(list2);
        list2.moveToBack(3);
        System.out.println(list2);
    }


}
