package org.example.MoshDSA;

import java.io.FileReader;
import java.util.NoSuchElementException;

public class LinkedList {
    private boolean isEmpty(){
        return first == null;
    }
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node first;
    private Node last;
    private int size=0;

    public void addFirst(int item){
        Node node = new Node(item);
        if(isEmpty()){
            first=last=node;
        }else{
            node.next = first;
            first = node;
        }

        size++;

    }

    public void addLast(int item){
        var node = new Node(item);
        if (first == null){
            first=last=node;
        }
        else{
            last.next = node;
            last = node;
        }
        size++;
    }
    public void removeFirst(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        if (first == last){
            size--;
            first=last=null;
            return;
        }

//        first = first.next;

        var second =  first.next;
        first.next = null;
        first = second;
        size--;
    }

    public void removeLast(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        if (first == last){
            first = last = null;
            size--;
            return;
        }
        var previous = getPrevious(last);
        last = previous;
        last.next = previous.next = null;
        size--;
    }
    private Node getPrevious(Node node){
        var current = first;
        while(current.next!=null){
            if (current.next == node){
                return current;
            }
            current = current.next;
        }
        return null;
    }
    public boolean contains(int item){
        return indexOf(item) != -1;

    }
    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public void reverseList(){             //10->20->30->40  p and c
        var current = first.next;
        var previous = first;
        while(current!=null){
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;
    }

    public int getKthFromTheEnd(int k){
        if (isEmpty()){
            throw new IllegalStateException();
        }
        var previous = first;
        var end = first;
        int i = 0;
        while(i<k-1){
            end=end.next;
            i++;
            if (end==null){
                throw new IllegalArgumentException();
            }
        }
        while(end!=last){
            previous = previous.next;
            end = end.next;
        }
        return previous.value;

    }
    public int size(){
        return size;
    }

    public int[] toArray(){
        int[] array = new int[size];
        var current = first;
        int i=0;
        while(current!=null){
            array[i] = current.value;
            current = current.next;
            i++;
        }
        return array;
    }

}
