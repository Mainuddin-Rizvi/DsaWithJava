package org.example.MoshDSA.linkedlist;

import org.example.MoshDSA.linkedlist.LinkedList;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.addFirst(12);
        list.addFirst(15);
        list.addFirst(35);
        list.removeLast();


        var array = list.toArray();
        System.out.println(Arrays.toString(array));


//        LinkedList list = new LinkedList<>();
//        list.add(10);
//        list.add(20);
//        list.add("hello");
//
//        System.out.println(list);
//        System.out.println(list.size());
//
//        var array = list.toArray();
//        System.out.println(Arrays.toString(array));
//        System.out.println(list.size());
    }
}
